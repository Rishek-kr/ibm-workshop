package com.ibm.oops;

import com.ibm.oops.payroll.Confirmed;
import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Intern;

public class Application
{
	public static void main( String[] args )
	{
		Employee employee = new Intern();
		employee.salary();
		employee= new Confirmed();
		employee.salary();
	}
}