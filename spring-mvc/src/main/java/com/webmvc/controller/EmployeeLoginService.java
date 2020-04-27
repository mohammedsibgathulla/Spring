package com.webmvc.controller;

import org.springframework.stereotype.Service;

@Service
public class EmployeeLoginService {
	public boolean validateUser(String name, String password) {
		if(name.equals("Mohammed") && password.equals("Shaik"))
			return true;

	return false;
	}
}
