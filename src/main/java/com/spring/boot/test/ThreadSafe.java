package com.spring.boot.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@RestController
public class ThreadSafe {
	
	private Long size =  0L;
	
	private ThreadLocal<Long> size2 = new ThreadLocal<Long>();
	
	@RequestMapping("safe")
	public void safe() {
		if (size2.get() == null) {
			size2.set(1L);
		} else {
			size2.set(size2.get() + 1L);
		}
		// size2不递增
		System.out.println(size2.get());
		
		
		
	}
	
	@RequestMapping("unsafe")
	public void unsafe() {
		// size会递增
		System.out.println(size ++);
		
		// size3不递增
		int size3 = 0;
		System.out.println(size3 ++);
	}
}
