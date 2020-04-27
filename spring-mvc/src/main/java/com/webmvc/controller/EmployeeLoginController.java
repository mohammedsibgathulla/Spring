package com.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeLoginController {
	@RequestMapping(value="/employee_login", method=RequestMethod.GET)
	public String showLoginPage() { 
		return "employee_login";
	}
	@RequestMapping(value="/employee_login", method=RequestMethod.POST)
	public String loginHandler(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password);
		return "employeewelcome";
	}

}
