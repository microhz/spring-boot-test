package com.spring.boot.test.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
@EnableWebMvc
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object cacheEx(Exception ex) {
		System.out.println("cache ex from controller... msg : " + ex.getMessage());
		return "test";
	}
}
