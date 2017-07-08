package com.jyxb.member.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@PropertySource("micro.list") // 默认会找classpath:
@EnableConfigurationProperties(ConfigSpringBoot.class)
public class App {
	
	@Autowired
	private ConfigSpringBoot configSpringBoot;
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication springApplication = new SpringApplication(App.class);
		springApplication.run(args);
	}

	@Value("${des}") // PropertySource注入
	private String des;

	@RequestMapping("hello")
	public String hello() {
		System.out.println(des);
		System.out.println(configSpringBoot.getName());
		return "hello spring boot";
	}
	
	@RequestMapping("profile")
	public String profile(@Value("${db}") String db) {
		System.out.println(db);
		return "test profile";
	}
}
