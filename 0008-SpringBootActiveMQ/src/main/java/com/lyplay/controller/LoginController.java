package com.lyplay.controller;

import javax.jms.Queue;
import javax.jms.Topic;

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
	private Topic topic;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private Producer producer;
	
	@RequestMapping(value = "/api/mq", method = RequestMethod.GET)
	@ResponseBody
	public String topic() {
		for(int i=0; i<100; i++){  
        	System.out.println("send queue is Swin.Liu!!! " + i);
            producer.sendMessage(queue, "myname queue is Swin.Liu!!! " + i);  
            System.out.println("send topic is Swin.Liu!!! " + i);
            producer.sendMessage(topic, "myname topic is Swin.Liu!!! " + i);  
        }  
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
