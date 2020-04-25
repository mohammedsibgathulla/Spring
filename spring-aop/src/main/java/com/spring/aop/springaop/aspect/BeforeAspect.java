package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//The combination of Advice & Pointcut is called an Aspect.
@Aspect
@Configuration
public class BeforeAspect {
	private org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
	//what kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..)) The below expression is called Pointcut
	//weaving & Weaver
	@Before("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint jointPoint) {
		//Below two lines is called Advice i.e the logic we execute when we intercept a method
		logger.info("Check for user access");
		logger.info("Allowed Execution for - {}", jointPoint);
	}

}
