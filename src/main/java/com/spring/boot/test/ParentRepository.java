package com.spring.boot.test;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author micro
 * @date 2017年7月8日
 * @description : 
 */
public interface ParentRepository extends JpaRepository<UserBasicParentInfo, Long>{

	UserBasicParentInfo findById(Long id);
}
