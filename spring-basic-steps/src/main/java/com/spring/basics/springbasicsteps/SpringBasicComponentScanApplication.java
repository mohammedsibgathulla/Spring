package com.spring.basics.springbasicsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.componentscan.ComponentDAO;
import com.spring.basics.scope.SpringBasicScopeApplication;
 

@SpringBootApplication 
@ComponentScan("com.spring.basics.componentscan")
public class SpringBasicComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicComponentScanApplication.class, args);
		 
		
		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO personDAO1 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
	 
 
	}

}
