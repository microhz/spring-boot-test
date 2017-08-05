package com.spring.boot.test.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author micro
 * @date 2017年8月5日
 * @description : 
 */
@Component
public class LogService {
	
	@Autowired
	private LogDao logDao;
	
	@Transactional(rollbackFor = Exception.class) // 只能在public方法生效
	public void start() {
		Log log = new Log();
		log.setTitle("test");
		logDao.save(log);
		
		addLog();
		System.out.println("success");
	}
	
	private void addLog() {
		Log log = new Log();
		log.setTitle("test2");
		logDao.save(log);
		int a = 1 / 0;
	}
}
