package com.webmvc.jee;

public class UserValidationService {
	public boolean validateUser(String name, String password) {
		if(name.equals("Mohammed") && password.equals("Shaik"))
			return true;

	return false;
	}
}
