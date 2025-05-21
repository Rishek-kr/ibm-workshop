package com.ibm.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springjpa.entities.Employee;
import com.ibm.springjpa.services.DepartmentService;
import com.ibm.springjpa.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentSerive;
	
	@GetMapping
	public String listEmployee(Model model) {
		model.addAttribute("employee", employeeService.getAllEmployees());
		return "employee/list";
	}
	@GetMapping("/new")
	public String showEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("department", departmentSerive.getAllDepartments());
		return "employee/form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee";
	}
	@PostMapping("/edit/save")
	public String updateEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee";
	}
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		model.addAttribute("department", departmentSerive.getAllDepartments());
		return "employee/form";
	}
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employee";
	}
	@GetMapping("/department/{departmentId}")
	public String listEmployeesByDepartment(@PathVariable Long departmentId, Model model) {
		model.addAttribute("employee", employeeService.getEmployeesByDepartmentId(departmentId));
		return "employee/list";
	}
	
}
