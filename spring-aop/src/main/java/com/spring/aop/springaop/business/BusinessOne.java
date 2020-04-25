package com.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.springaop.dao.DaoOne;
@Service
public class BusinessOne {
	@Autowired
	DaoOne daoOne;
	
	public String calculate() {
		return daoOne.retrieveData();
	}

}
