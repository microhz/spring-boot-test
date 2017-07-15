package com.spring.boot.test.mvc;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@Controller
public class PageController {
	
	@PostConstruct
	public void init() {
		System.out.println("******");
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("hello")
	public String hello() {
		// 去查找 classpath : template
		return "hello";
	}

}
