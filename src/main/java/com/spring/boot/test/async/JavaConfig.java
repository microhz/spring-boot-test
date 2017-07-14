package com.spring.boot.test.async;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
//@Configuration
//@EnableAsync
public class JavaConfig {

	// 此taskExecutor可以不注入照样Async注解生效，有默认值
	/*@Bean
	public TaskExecutor microTaskExecutor() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(10);
		return threadPoolTaskExecutor;
	}*/
}
