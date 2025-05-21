package com.ibm.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springjpa.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	Department findByName(String name);
}
