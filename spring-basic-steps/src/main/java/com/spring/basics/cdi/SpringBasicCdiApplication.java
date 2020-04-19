package com.spring.basics.cdi; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicCdiApplication {

	private static Logger LOGGER =   LoggerFactory.getLogger(SpringBasicCdiApplication.class);	
	public static void main(String[] args) { 
//		ApplicationContext applicationContext = 
//				new AnnotationConfigApplicationContext(SpringBasicCdiApplication.class);
		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicCdiApplication.class)){
		
		
				//SpringApplication.run(SpringBasicCdiApplication.class, args);
		PersonDAO personDAO = annotationConfigApplicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = annotationConfigApplicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		}
		

 
 
	 
 
	}

}
