package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		String firstPara=null;
		String secondPara=null;
		System.out.println("Start");
		try {
			firstPara=args[0];
			secondPara=args[1];
			try {
				System.out.println(Integer.parseInt(firstPara)+Integer.parseInt(secondPara));
			}catch(NumberFormatException ex){
				System.out.println("Nested try block");
			}
			finally {
				System.out.println("End of outer try block");
			}
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
		catch(Exception exception){
			System.out.println("Enter correct input");
			exception.printStackTrace();
		}
		System.out.println("End");
	}
}