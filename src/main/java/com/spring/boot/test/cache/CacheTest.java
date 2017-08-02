package com.spring.boot.test.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author micro
 * @date 2017年8月2日
 * @description : 
 */
@SpringBootApplication
public class CacheTest implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		new SpringApplication(CacheTest.class).run(args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("第一次查询");
		System.out.println(userDao.getUser(1L));
		System.out.println("第二次查询");
		System.out.println(userDao.getUser(1L));
	}
}
