package com.springrest.basics.springrestbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringrestbasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringrestbasicsApplication.class, args);
		//The run method also returns ApplicationContext
		for(String name: applicationContext.getBeanDefinitionNames())
		System.out.println(name);
	}

}
