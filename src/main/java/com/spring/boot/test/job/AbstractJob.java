package com.spring.boot.test.job;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author micro
 * @date 2017年8月28日
 * @description :
 */
public abstract class AbstractJob implements Runnable {
	/**
	 * 模版方法
	 */
	protected abstract void execute();
	
	@Scheduled(cron = "* * * * * *")
	public void run() {
		System.out.println("开始执行定时任务");
		execute();
		System.out.println("定时任务指定完毕");
	}

}
