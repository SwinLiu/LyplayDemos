package com.lyplay;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lyplay.service.Producer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
@WebAppConfiguration
public class DemoApplicationTests {
	
	@Autowired  
    private Producer producer;  
      
    @Test  
    public void contextLoads() throws InterruptedException {  
        Destination queueDestination = new ActiveMQQueue("mytest.queue");  
        Destination topicDestination = new ActiveMQTopic("mytest.topic");  
          
        for(int i=0; i<100; i++){  
        	System.out.println("send queue is Swin.Liu!!! " + i);
            producer.sendMessage(queueDestination, "myname queue is Swin.Liu!!! " + i);  
            System.out.println("send topic is Swin.Liu!!! " + i);
            producer.sendMessage(topicDestination, "myname topic is Swin.Liu!!! " + i);  
        }  
    }  

}
