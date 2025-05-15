package com.ibm.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplate");

//		System.out.println("--------Records Creation---------");
//		employeeJDBCTemplate.create("Puja", "Kumari", 15000);

		System.out.println("------Listing Multiple Records--------");
//		List<Employee> employees = employeeJDBCTemplate.listEmpolyees();

		employeeJDBCTemplate.delete(7);

		
		Employee employee = employeeJDBCTemplate.getEmpolyee(1);
		System.out.print("ID : " + employee.getId());
		System.out.print(", FirstName : " + employee.getFirstName());
		System.out.print(", LastName : " + employee.getLastName());
		System.out.println(", Salary : " + employee.getSalary());

	}
}