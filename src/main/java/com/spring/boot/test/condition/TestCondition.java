package com.spring.boot.test.condition;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.apple.eawt.Application;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@Component
public class TestCondition implements ApplicationContextAware {

	private ApplicationContext application;
	@PostConstruct
	public void init() {
		Product product = application.getBean(Product.class);
		product.print();
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.application = applicationContext;
	}
}
