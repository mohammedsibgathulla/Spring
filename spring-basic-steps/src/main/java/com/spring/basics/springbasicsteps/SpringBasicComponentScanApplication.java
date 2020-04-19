package com.spring.basics.springbasicsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.componentscan.ComponentDAO	;
 

@Configuration
@ComponentScan
@ComponentScan("com.spring.basics.componentscan")
public class SpringBasicComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicComponentScanApplication.class);
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicComponentScanApplication.class)){
		 
		
		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO personDAO1 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		}
	 
 
	}

}
