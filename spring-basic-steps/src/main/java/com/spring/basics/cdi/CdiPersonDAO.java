package com.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named 
public class CdiPersonDAO{
	@Inject
	CdiJdbcConnection jdbcConnection;

	public CdiJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(CdiJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	public int getData() {
		return 3;
	}
 
}
