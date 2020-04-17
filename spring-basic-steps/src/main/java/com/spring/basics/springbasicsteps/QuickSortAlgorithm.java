package com.spring.basics.springbasicsteps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Quick sort");
	}
}
