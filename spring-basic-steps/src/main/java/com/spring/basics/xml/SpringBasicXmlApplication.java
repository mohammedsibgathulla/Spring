package com.spring.basics.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class SpringBasicXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicXmlApplication.class);	
	public static void main(String[] args) { 
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		XmlPersonDAO personDAO1 = applicationContext.getBean(XmlPersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getXmlJdbcConnection());
		}
		
 
	 
 
	}

}
