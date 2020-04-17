package com.spring.basics.springbasicsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //It will scan for beans present inside this package and subpackages
public class SpringBasicStepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBasicStepsApplication.class, args);
		//new BinarySearchImpl(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicStepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		binarySearchImpl.binarySearch();
 
	 
 
	}

}
