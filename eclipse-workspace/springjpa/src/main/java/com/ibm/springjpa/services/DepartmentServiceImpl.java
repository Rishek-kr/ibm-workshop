package com.ibm.springjpa.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springjpa.entities.Department;
import com.ibm.springjpa.repositories.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Department not found"));
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		Department existingDepartment = getDepartmentById(id);
		existingDepartment.setName(department.getname());
		return departmentRepository.save(existingDepartment);
	}

}