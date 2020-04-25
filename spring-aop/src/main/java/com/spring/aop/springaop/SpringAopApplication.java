package com.spring.aop.springaop;
 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.springaop.business.BusinessOne;
import com.spring.aop.springaop.business.BusinessTwo;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	private org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Autowired
	BusinessOne businessOne;
	
	@Autowired
	BusinessTwo businessTwo;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		logger.info(businessOne.calculate());
		logger.info(businessTwo.calculate());
		
	}

}
