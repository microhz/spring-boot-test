package com.spring.boot.test.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author micro
 * @date 2017年7月14日
 * @description :
 */
public interface UserDao extends MongoRepository<User, Long> {
	User getUserByName(String name);
}

