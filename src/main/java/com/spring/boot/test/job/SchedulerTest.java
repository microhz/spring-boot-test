package com.spring.boot.test.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@Component
public class SchedulerTest {
	
	private int i = 0;

	@Scheduled(cron = "* * * * * *")
	public void test() {
		System.out.println(i ++);
	}
}
