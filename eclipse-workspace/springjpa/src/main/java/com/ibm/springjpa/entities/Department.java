package com.ibm.springjpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	
	@OneToMany(mappedBy = "department" , cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		employee.setDepartment(this);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		employee.setDepartment(null);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}