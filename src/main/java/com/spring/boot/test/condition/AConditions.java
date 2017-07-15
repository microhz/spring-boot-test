package com.spring.boot.test.condition;

import java.util.Date;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author micro
 * @date 2017年7月15日
 * @description : 
 */
public class AConditions implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return true;
	}

}
