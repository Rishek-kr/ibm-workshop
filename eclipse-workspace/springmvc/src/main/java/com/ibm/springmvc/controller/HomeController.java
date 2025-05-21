package com.ibm.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView welcome(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/about")
	public ModelAndView aboutus(HttpServletResponse response) throws IOException{
		return new ModelAndView("about");
	}
	
	@RequestMapping(value="/EmployeeForm")
	public ModelAndView employeeForm(HttpServletResponse response) throws IOException{
		return new ModelAndView("EmployeeForm");
	}
}