package com.spring.basics.springbasicsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicStepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBasicStepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		binarySearchImpl.sort();
	 
 
	}

}
