package com.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

import com.spring.aop.springaop.aspect.TrackTime;

@Repository
public class DaoTwo {
	@TrackTime
	public String retrieveData() {
		return "DAO 2";
	}
}
