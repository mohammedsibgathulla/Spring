package com.spring.basics.springbasicsteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
 
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Bubble Sort Algorithm");
	}
}
