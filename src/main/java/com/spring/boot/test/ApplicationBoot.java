package com.spring.boot.test;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.test.async.AsyncBean;
import com.spring.boot.test.profile.SuperBean;


/**
 * @author micro
 * @date 2017年7月6日
 * @description : 
 */
@RestController // 有这个配置返回参数自动JSON
@SpringBootApplication
public class ApplicationBoot {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ApplicationBoot.class);
		springApplication.setAdditionalProfiles("pub"); // 注入dev环境下的
		springApplication.run(args);
	}
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	public Object test() {
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM user_parent_basic_info LIMIT 1,10");
		return resultList;
	}*/
	
	/*@Autowired
	private ParentRepository parentRepository;
	
	@RequestMapping("/testJpa")
	public Object jpa() {
		return parentRepository.findById(1409002L);
	}*/
	
	/*@Autowired
	private ConfigProperties configProperties;
	@RequestMapping("config")
	public Object config() {
		return configProperties.getName();
	}*/
	
	
	/**
	 * 测试profile完毕
	 */
	/*@Autowired
	private SuperBean superBean;
	
//	@PostConstruct
	public Object testProfile() {
		System.out.println("============ spring profile ========");
		superBean.print();
		return "test";
	}
	*/
	
	@Autowired
	private AsyncBean asyncBean;
	@PostConstruct
	public Object testAsync() {
		asyncBean.syncMethod();
		System.out.println("main thread is running...");
		return "test async";
	}
	
	
	// 在本类中无效
	/*@Async("microTaskExecutor")
	public void async() {
		try {
			System.out.println("hold this thread...");
			Thread.sleep(1000);
			System.out.println("async executed...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
	
}
