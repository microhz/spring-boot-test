package com.spring.boot.test.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年8月3日
 * @description : 
 */
@Component
public class Comsumer {

	@JmsListener(destination = "micro-queue")
	public void recive(String msg) {
		System.out.println("接收到消息 : " + msg);
	}
}
