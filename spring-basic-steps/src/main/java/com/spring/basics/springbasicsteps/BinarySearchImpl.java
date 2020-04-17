package com.spring.basics.springbasicsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	@Autowired
	@Qualifier("quick")
	SortAlgorithm sortAlgorithm;
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		// TODO Auto-generated constructor stub
//		this.sortAlgorithm = sortAlgorithm;
//		//this.sortAlgorithm.sort();
//		//sortAlgorithm.sort();
//	}
	public void binarySearch() {
		sortAlgorithm.sort();
	}
}
