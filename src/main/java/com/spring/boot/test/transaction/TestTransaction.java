package com.spring.boot.test.transaction;
/**
 * @author micro
 * @date 2017年8月5日
 * @description : 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;


@SpringBootApplication
public class TestTransaction implements CommandLineRunner {

	public static void main(String[] args) {
		new SpringApplication(TestTransaction.class).run(args);
	}
	
	@Autowired
	private LogService logService;
	@Override
	public void run(String... args) throws Exception {
		try {
			logService.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}
