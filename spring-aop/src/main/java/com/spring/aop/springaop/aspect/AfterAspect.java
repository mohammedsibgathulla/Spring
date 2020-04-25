package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//The combination of Advice & Pointcut is called an Aspect.
@Aspect
@Configuration
public class AfterAspect {
	private org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
 
	@AfterReturning(
			value="execution(* com.spring.aop.springaop.business.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint jointPoint, Object result) {
		logger.info("{} returned with value {}", jointPoint, result);
	}
	
	@AfterThrowing(
			value="execution(* com.spring.aop.springaop.business.*.*(..))", throwing="exception")
	public void afterThrowing(JoinPoint jointPoint, Exception exception) {
		logger.info("{} returned with exception {}", jointPoint, exception);
	}
	
	@After(
			value="execution(* com.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint jointPoint) {
		logger.info("After execution of {}", jointPoint);
	}

}
