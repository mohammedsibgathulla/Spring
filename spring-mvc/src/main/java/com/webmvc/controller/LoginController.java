package com.webmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController { 
	@RequestMapping(value="/login")
	public String sayHell() { 
		return "login";
	}
}
