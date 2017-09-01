package com.lyplay.controller;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lyplay.service.Producer;

@RestController
@EnableAutoConfiguration
public class LoginController {

	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private Producer producer;
	
	@RequestMapping(value = "/api/mq", method = RequestMethod.GET)
	@ResponseBody
	public String topic() {
		
		Destination queueDestination = new ActiveMQQueue("mytest.queue");  
        Destination topicDestination = new ActiveMQTopic("mytest.topic");  
          
    	System.out.println("send queue is Swin.Liu!!! ");
        producer.sendMessage(queueDestination, "myname queue is Swin.Liu!!! " + Math.random());  
        System.out.println("send topic is Swin.Liu!!! ");
        producer.sendMessage(topicDestination, "myname topic is Swin.Liu!!! " + Math.random());  
        return "sent mq messages.";
    }
	
	
	@RequestMapping(value = "/api/hello1", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		stringRedisTemplate.opsForValue().set("stringKey2", "stringValue2");
        return "Hello M1y World1!";
    }
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	@ResponseBody
	public String todos() {
		stringRedisTemplate.opsForValue().set("stringKey", "stringValue");
        return "Hello M1y World1!";
    }
	

}
