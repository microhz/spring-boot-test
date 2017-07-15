package com.spring.boot.test.mongo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
/**
 * 最开始无法被扫描到，@PostConstruct可以看到没被扫描到，但是删除本类重建了之后正常工作，问题：未知
 * @author mapc 
 * @date 2017年7月15日
 */
//@RestController
public class MongoTest {
	
	@PostConstruct
	public void init() {
		System.out.println("****************正在启动 mongoDB controller **********************");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private UserDao userDao;
	@RequestMapping("/save")
	public Object test() {
		User user = new User();
		user.setId(1L);
		user.setName("micro");
//		userDao.save(user);
		
		// ---- find
		User user2 = userDao.getUserByName("micro");
		System.out.println(user2);
		return "ok";
	}
}
