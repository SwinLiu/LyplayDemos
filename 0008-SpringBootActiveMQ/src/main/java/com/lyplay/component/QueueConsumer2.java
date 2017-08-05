package com.lyplay.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;  
  
@Component  
public class QueueConsumer2 {

	// 使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "mytest.queue")  
    public void receiveQueue(String text) {  
        System.out.println("Queue Consumer 2 收到的报文为:"+text);  
    }
    
}
