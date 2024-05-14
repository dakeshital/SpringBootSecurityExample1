package com.security.SpringBootSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String getLoginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String getLogoutPage() {
		return "logout.jsp";
	}
}
