package com.spring.basics.springbasicsteps;

public class BinarySearchImpl implements SortAlgorithm{

	SortAlgorithm sortAlgorithm;
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		// TODO Auto-generated constructor stub
		this.sortAlgorithm = sortAlgorithm;
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		 sortAlgorithm.sort();
	}


}
