package com.spring.boot.test;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author micro
 * @date 2017年7月6日
 * @description : 
 */
@RestController
@EnableAutoConfiguration
public class ApplicationBoot {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ApplicationBoot.class);
		springApplication.run(args);
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	@ResponseBody
	public Object test() {
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM user_parent_basic_info LIMIT 1,10");
		return resultList;
	}
	
	@Autowired
	private ParentRepository parentRepository;
	
	@RequestMapping("/testJpa")
	@ResponseBody
	public Object jpa() {
		return parentRepository.findById(1409002L);
	}
	
}
