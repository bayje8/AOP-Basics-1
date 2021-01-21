package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTakenAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Around("com.example.demo.aspect.PointCutDefinitions.timeTakenAnnotation()")
	public Object timeTaken(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object value;
		value = proceedingJoinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		log.info("Time taken to execute {} is {}ms", proceedingJoinPoint.getSignature().getName(), timeTaken);
		return value;
	}
}
