package com.spring.basics.springbasicsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	@Autowired
	SortAlgorithm sortAlgorithm;
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		// TODO Auto-generated constructor stub
		sortAlgorithm.sort();
	}
	public void binarySearch() {
		sortAlgorithm.sort();
	}
}
