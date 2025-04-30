package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Start");
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Run the program supplying a number");
		}
		System.out.println("End");
	}
}