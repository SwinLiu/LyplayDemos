package com.lyplay;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsMessagingTemplate;

@SpringBootApplication
public class App extends SpringBootServletInitializer {
	public static void main( String[] args )  
    {  
        SpringApplication.run(App.class, args);  
    }  

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
    
    
    
    @Bean  
    public Queue queue(){  
    	return new ActiveMQQueue("mytest.queue");  
    }
    
    @Bean  
    public Topic topic(){  
    	return new ActiveMQTopic("mytest.topic");  
    }
    
    
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		// 此链接信息可放入配置文件中
		return new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
	}

	@Bean
	public JmsMessagingTemplate jmsMessagingTemplate(ActiveMQConnectionFactory connectionFactory) {
		System.out.println("get JmsMessagingTemplate");
		return new JmsMessagingTemplate(connectionFactory);
	}
    
    
}
