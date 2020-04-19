package com.spring.basics.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringBasicPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicPropertiesApplication.class);
	public static void main(String[] args) { 
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicPropertiesApplication.class)){
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			LOGGER.info("url -> {}", someExternalService.getUrl());
		 
		}
 
	 
 
	}

}
