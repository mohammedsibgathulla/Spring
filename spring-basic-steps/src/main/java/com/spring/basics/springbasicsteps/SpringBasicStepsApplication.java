package com.spring.basics.springbasicsteps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicStepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBasicStepsApplication.class, args);
		//new BinarySearchImpl(new BubbleSortAlgorithm());
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicStepsApplication.class)){
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		binarySearchImpl.binarySearch();
		}
 
	 
 
	}

}
