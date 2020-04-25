package com.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {
	public String retrieveData() {
		return "DAO 2";
	}
}
