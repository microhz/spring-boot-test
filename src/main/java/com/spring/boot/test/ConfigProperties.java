package com.spring.boot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年7月13日
 * @description : 
 */
@Component
@EnableAutoConfiguration
public class ConfigProperties {

	/*@Value("${name}")
	private String name;
	
	public String getName() {
		return this.name;
	}*/
}
