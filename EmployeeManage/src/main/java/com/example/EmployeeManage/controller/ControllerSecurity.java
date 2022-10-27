package com.example.EmployeeManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping
@Controller
public class ControllerSecurity {
	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("home");
	}
}
