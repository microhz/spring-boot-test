package com.spring.boot.test.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
@Component
public class AsyncBean {

	@Async
	public void syncMethod() {
		System.out.println("sub thread hang up this..");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sub thread executed...");
	}
}
