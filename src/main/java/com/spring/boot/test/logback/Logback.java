package com.spring.boot.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
@RestController
public class Logback {

	@RequestMapping("logback")
	public Object test() {
		getLoggerByName("main").error("test main error");
		getLoggerByName("api").debug("test api debug");
		return "ok";
	}
	
	private Logger getLoggerByName(String name) {
		return LoggerFactory.getLogger(name);
	}
}
