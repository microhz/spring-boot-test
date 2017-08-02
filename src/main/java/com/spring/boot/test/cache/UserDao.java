package com.spring.boot.test.cache;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年8月2日
 * @description :
 */
@Component
@EnableCaching
public class UserDao {

	private Map<Long, User> userMap;

	@PostConstruct
	public void init() {
		//模拟数据库
		userMap = new HashMap<Long, User>();
		userMap.put(1L, new User(1L,"micro1"));
		userMap.put(2L, new User(2L, "micro2"));
	}

	@Cacheable(cacheNames = "user")
	public User getUser(Long userId) {
		System.out.println("查询数据库:userId ->" + userId);
		return userMap.get(userId);
	}
}

class User {

	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
