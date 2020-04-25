package com.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoOne {
	public String retrieveData() {
		return "DAO 1";
	}

}
