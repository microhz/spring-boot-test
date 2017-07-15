package com.spring.boot.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
@Aspect
@Component
public class ControllerLogAspect {

	
//	@Pointcut("execution(* com.spring.boot.test.*.*(..))")
//	public void cut(){}
	
	@Before("execution(* com.spring.boot.test.*.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("before : " + joinPoint.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.spring.boot.test.*.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("after : " + joinPoint.getSignature().getName());
	}
	
	@Around("execution(* com.spring.boot.test.*.*(..))")
	public void arount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("around before");
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Object o : proceedingJoinPoint.getArgs()) {
			sb.append(o);
		}
		System.out.println(proceedingJoinPoint.getSignature().getName() + " args : " + sb);
		Object ret;
		try {
			ret = proceedingJoinPoint.proceed();
			System.out.println("around after " + ret);
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;// 如果这里不抛出，afterThrow捕捉不到
		}
		
	}
	
	@AfterThrowing(value = "execution(* com.spring.boot.test.*.*(..))",throwing = "ex")
	public void catchThrow(Throwable ex) {
		System.out.println("after throw cache err");
		System.out.println(ex.getMessage());
	}
}
