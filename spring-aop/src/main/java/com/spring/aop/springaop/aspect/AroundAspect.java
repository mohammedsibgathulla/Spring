package com.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//The combination of Advice & Pointcut is called an Aspect.
@Aspect
@Configuration
public class AroundAspect {
	private org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Around(
			value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.tackTimeAnnotation()")
	public void after(ProceedingJoinPoint proceedingJointPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		proceedingJointPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		
		logger.info("Time taken by {} is {}",proceedingJointPoint,  timeTaken);
	}

}
