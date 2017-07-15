package com.spring.boot.test.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@Configuration
public class ProductConfig {

	@Bean
	@Conditional(AConditions.class)
	public Product productA() {
		return new ProductA();
	}
	
	@Bean
	@Conditional(BConditions.class)
	public Product productB() {
		return new ProductB();
	}
}
