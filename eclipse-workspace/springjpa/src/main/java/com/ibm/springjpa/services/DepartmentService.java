package com.ibm.springjpa.services;

import java.util.List;

import com.ibm.springjpa.entities.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();

	Department getDepartmentById(Long id);

	Department saveDepartment(Department department);

	void deleteDepartment(Long id);

	Department updateDepartment (Long id, Department department);
}
