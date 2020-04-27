package com.webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeLoginController {
	@Autowired
	EmployeeLoginService employeeLoginService;
	@RequestMapping(value="/employee_login", method=RequestMethod.GET)
	public String showLoginPage() { 
		return "employee_login";
	}
	@RequestMapping(value="/employee_login", method=RequestMethod.POST)
	public String loginHandler(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!employeeLoginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "employee_login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "employeewelcome";
	}

}
