package com.spring.basics.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication 
public class SpringBasicScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicScopeApplication.class);	
	public static void main(String[] args) { 
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
 
 
	 
 
	}

}
