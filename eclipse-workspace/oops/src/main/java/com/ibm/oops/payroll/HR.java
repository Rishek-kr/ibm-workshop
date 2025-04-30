package com.ibm.oops.payroll;

public class HR {
	public Employee recruit(String empType) {
		if (empType.equalsIgnoreCase("i")) {
			Intern intern = new Intern();
			return intern;
		} 
		else if (empType.equalsIgnoreCase("p")) {
			return new Permanent();

		}
		return null;
	}
	
}
