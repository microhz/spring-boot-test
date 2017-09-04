package com.spring.boot.test.job;

import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年8月28日
 * @description : 
 */
@Component
public class SayHelloJob extends AbstractJob {

	@Override
	protected void execute() {
		System.out.println("hello ..");
	}

}
