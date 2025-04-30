package com.ibm.oops.payroll;

public class Finance {
	public void processSalary(Employee employee) {
		employee.netPay();
		if(employee instanceof Permanent) {
			Permanent permanentEmployee = (Permanent)employee;
			permanentEmployee.Transportation();
		}
	}

}
