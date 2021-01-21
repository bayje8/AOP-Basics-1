package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Aspect -> Pointcut + Advice
@Aspect
@Component
@Order(1)
public class AfterAspectsTwo {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@After(value="com.example.demo.aspect.PointCutDefinitions.executeBusinessLayerPCD()")
	public void afterTheMethodsSecondaryCall() {
	//Advice
		logger.info("After the Method this advice will be invoked >>> Prority Two");
	}	
	
	@AfterReturning(value="com.example.demo.aspect.PointCutDefinitions.executeBusinessLayerPCD()", returning="result")
	public void afterTheMethodsThirdCall(JoinPoint jp, Object result) {
	//Advice
		logger.info("After the Method this advice will be invoked >>> Prority Three");
		logger.info("Join Point {} returns {}",jp,result);
	}
	
	@AfterThrowing(value="com.example.demo.aspect.PointCutDefinitions.executeBusinessLayerPCD()", throwing="result")
	public void afterExceptionCall(JoinPoint jp, Object result) {
	//Advice
		logger.info("After an Exception in the Method this advice will be invoked >>> Prority Three");
		logger.info("Join Point {} returns {}",jp,result);
	}
	
}
