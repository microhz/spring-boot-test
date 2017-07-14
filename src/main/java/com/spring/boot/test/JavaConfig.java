package com.spring.boot.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.boot.test.profile.DevBean;
import com.spring.boot.test.profile.PubBean;
import com.spring.boot.test.profile.SuperBean;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
//@Configuration
public class JavaConfig {

	@Bean
	@Profile("dev")
	public SuperBean loadSuperBeanByDev() {
		return new DevBean();
	}
	
	@Bean
	@Profile("pub")
	public SuperBean loadSuperBeanByPub() {
		return new PubBean();
	}
}

