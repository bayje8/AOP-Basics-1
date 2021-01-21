package com.example.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutDefinitions {

	@Pointcut("execution(* com.example.demo.business.*.*(..))")
	public void executeBusinessLayerPCD() {}
	
	
	@Pointcut("execution(* com.example.demo.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("com.example.demo.aspect.PointCutDefinitions.executeBusinessLayerPCD() && com.example.demo.aspect.PointCutDefinitions.dataLayerExecution()")
	public void dataAndBusinessLayerExecution() {}
	
	@Pointcut("@annotation(com.example.demo.annotations.TrackTime)")
	public void timeTakenAnnotation() {}
}
