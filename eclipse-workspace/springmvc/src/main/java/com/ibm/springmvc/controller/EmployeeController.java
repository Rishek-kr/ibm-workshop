package com.ibm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvc.model.Employee;

@Controller
@RequestMapping("/api/employee")
public class EmployeeController {
	@GetMapping("/employeeForm")
	public String showForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "EmployeeForm";
	}
	@PostMapping("/submitEmployee")
	public String submitForm(@ModelAttribute("employee")Employee employee, Model model) {
		model.addAttribute("employee", employee);
		return "EmployeeDetails";
	}
}
