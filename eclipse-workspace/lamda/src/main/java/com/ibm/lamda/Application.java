package com.ibm.lamda;

interface Printer{
	public void print(String name);
}

class Process{
	public void execute(String printerName, Printer printer) {
		printer.print(printerName);
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Process process = new Process();
		process.execute("HP Printer Printing", System.out::println);
		process.execute("Canon",(name)-> System.out.println(name+"Printer printing.."));
	}
}