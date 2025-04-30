package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Finance;
import com.ibm.oops.payroll.HR;

public class Application
{
	public static void main( String[] args )
	{
		HR hr = new HR();
		Finance finance = new Finance(); 
		Employee employee = hr.recruit("I");
		if(employee!= null) {
			finance.processSalary(employee);
		}
		employee= hr.recruit("P");
		if(employee!= null) {
			finance.processSalary(employee);
		}
	}
}