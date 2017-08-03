package com.spring.boot.test.mq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年8月3日
 * @description : 
 */
@Component
public class Producer {

	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	
	public void sendMessage(String msg) {
		System.out.println("生产者发送消息");
		jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}
}
