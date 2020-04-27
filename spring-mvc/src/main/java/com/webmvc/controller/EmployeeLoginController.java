package com.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeLoginController {
	@RequestMapping(value="/employee_login")
	public String employeeLogin() {
		return "employee_login";
	}

}
