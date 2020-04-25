package com.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.springaop.dao.DaoTwo;
@Service
public class BusinessTwo {
	@Autowired
	DaoTwo daoTwo;
	
	public String calculate() {
		return daoTwo.retrieveData();
	}

}
