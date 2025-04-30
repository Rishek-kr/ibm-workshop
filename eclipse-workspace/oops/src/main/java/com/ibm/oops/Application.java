package com.ibm.oops;
interface Printer{
	void print();
}
class HPPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("HP Printer printing...");
		
	}
}
class Process{
	public void execute(Printer printer) {
		printer.print();
	}
}
	
//import com.ibm.oops.payroll.Employee;
//import com.ibm.oops.payroll.Finance;
//import com.ibm.oops.payroll.HR;

public class Application
{
	public static void main( String[] args )
	{
//		HR hr = new HR();
//		Finance finance = new Finance(); 
//		Employee employee = hr.recruit("I");
//		if(employee!= null) {
//			finance.processSalary(employee);
//		}
//		employee= hr.recruit("P");
//		if(employee!= null) {
//			finance.processSalary(employee);
//		}
//		employee= hr.recruit("F");
//		if(employee!= null) {
//			finance.processSalary(employee);
//		}
		Process process = new Process();
//		process.execute(new HPPrinter());
		process.execute(()-> System.out.println("HP Printer printing..."));
	}


}