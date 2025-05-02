package com.ibm.exceptions;

import com.ibm.exceptions.math.Arithmatic;

//class IllegalAgeException extends Throwable{
//	@Override
//	public String getMessage() {
//		return "You are not fit for voting";
//	}
//}
//
//
//class ElectionVoting{
//	public void register(int age) throws IllegalAgeException{
//		if(age<18) {
//			throw new IllegalAgeException();
//		}
//		System.out.println("Registration completed");
//	}
//}


public class Application
{
	public static void main( String[] args )
	{
//		String firstPara=null;
//		String secondPara=null;
		System.out.println("Start");
//		try {
//			firstPara=args[0];
//			secondPara=args[1];
//			try {
//				System.out.println(Integer.parseInt(firstPara)+Integer.parseInt(secondPara));
//			}catch(NumberFormatException ex){
//				System.out.println("Nested try block");
//			}
//			finally {
//				System.out.println("End of outer try block");
//			}
//		}
////		}catch(ArrayIndexOutOfBoundsException ex){
////			System.out.println("Run the program supplying a number");
////		}
//		catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){	
//			System.out.println("Run the program supplying a number");
//		}
//		catch(ArithmeticException ex){
//			System.out.println("Run the program supplying a number");
//		}
////		catch(NumberFormatException ex){
////			System.out.println("Run the program supplying a number");
////		}
//		catch(Exception exception){
//			System.out.println("Enter correct input");
//			exception.printStackTrace();
//		}
//		ElectionVoting electionVoting = new ElectionVoting();
//		try {
//			electionVoting.register(17);
//		}catch(IllegalAgeException e){
//			e.printStackTrace();
//		}
//		
		Arithmatic arithmatic = new Arithmatic();
		assert ( arithmatic.sum(2, 4)==6):"The sum method is defective";
		System.out.println("End");
	}
}