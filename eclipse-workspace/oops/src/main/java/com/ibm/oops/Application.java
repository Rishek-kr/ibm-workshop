package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.Permanent;

public class Application
{
	public static void main( String[] args )
	{
		HR hr = new HR();
		Employee employee = hr.recruit("I");
		employee.salary();
		employee= hr.recruit("p");
		employee.salary();
	}
}