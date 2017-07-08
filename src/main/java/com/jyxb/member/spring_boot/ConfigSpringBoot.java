package com.jyxb.member.spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author micro
 * @date 2017年7月5日
 * @description :
 */
@ConfigurationProperties("config.properties")
public class ConfigSpringBoot {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
