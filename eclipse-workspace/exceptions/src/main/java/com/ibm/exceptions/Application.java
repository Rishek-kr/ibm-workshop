package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Start");
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}
//		}catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("Run the program supplying a number");
//		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){	
			System.out.println("Run the program supplying a number");
		}
		catch(ArithmeticException ex){
			System.out.println("Run the program supplying a number");
		}
//		catch(NumberFormatException ex){
//			System.out.println("Run the program supplying a number");
//		}
//		catch(Exception ex){
//			System.out.println("Run the program supplying a number");
//			exception.
//		}
		System.out.println("End");
	}
}