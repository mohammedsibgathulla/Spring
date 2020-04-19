package com.spring.basics.springbasicsteps;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl{
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
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
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("From post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("From pre destroy");
	}
}
