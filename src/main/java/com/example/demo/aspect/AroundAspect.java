package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//Aspect
@Aspect
@Component
public class AroundAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around(value="com.example.demo.aspect.PointCutDefinitions.executeBusinessLayerPCD()")
	public Object testingAroundAspect(ProceedingJoinPoint jp) throws Throwable {
		logger.info("Before Point-cut");
		Object value = jp.proceed();
		logger.info("After Point-cut");
		return value;
	}
}
