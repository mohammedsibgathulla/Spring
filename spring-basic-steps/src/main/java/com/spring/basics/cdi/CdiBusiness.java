package com.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
	@Inject
	CdiPersonDAO cdiPersonDAO;
	
	public int getData() {
		return cdiPersonDAO.getData();
	}
	

}
