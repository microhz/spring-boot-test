package com.spring.boot.test;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@RestController
public class TestController {
	
	@PostConstruct
	public void init() {
		System.out.println("**************************************");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("test")
	public void test() {
		System.out.println("**************************************");
		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
