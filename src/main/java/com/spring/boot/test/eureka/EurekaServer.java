package com.spring.boot.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author micro
 * @date 2017年7月17日
 * @description : 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

	/**
	 * 本机器座位eureka的server
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
