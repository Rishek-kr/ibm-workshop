package com.ibm.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvc.entities.Employee;
import com.ibm.springmvc.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee-form";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee/list";
	}
	@GetMapping("/list")
	public String listEmployee(Model model) {
		return "employee-list";
	}
//	@GetMapping("/employeeForm")
//	public String showForm(Model model) {
//		model.addAttribute("employee", new Employee());
//		return "EmployeeForm";
//	}
//	@PostMapping("/submitEmployee")
//	public String submitForm(@ModelAttribute("employee")Employee employee, Model model) {
//		model.addAttribute("employee", employee);
//		return "EmployeeDetails";
//	}
}
