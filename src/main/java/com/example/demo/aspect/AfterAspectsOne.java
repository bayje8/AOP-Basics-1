package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Aspect -> Pointcut + Advice
@Aspect
@Component
@Order(2)
public class AfterAspectsOne {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Point-cut
	@After(value = "com.example.demo.aspect.PointCutDefinitions.dataLayerExecution()")
	public void afterTheMethods() {
	//Advice	
		logger.info("After the Method this advice will be invoked >>> Prority One");
	}
	
}
