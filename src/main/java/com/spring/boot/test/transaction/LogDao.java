package com.spring.boot.test.transaction;
/**
 * @author micro
 * @date 2017年8月5日
 * @description : 
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDao extends JpaRepository<Log, Long>{

}
