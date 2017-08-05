package com.spring.boot.test.mq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author micro
 * @date 2017年8月3日
 * @description : 
 */
@SpringBootApplication
public class ActiveMqTest implements CommandLineRunner {

	public static void main(String[] args) {
		new SpringApplication(ActiveMqTest.class).run(args);
	}
	
	@Autowired
	private Producer producer;

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage("你好!micro");
	}
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("micro-queue");
	}
}


