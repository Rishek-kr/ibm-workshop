package com.ibm.statics;

class Data{
	static public int value;
	public int getValue() {
		return value;
	}
	{
		System.out.println("INline");
	}
	static {// Static Initializer
		value=10;
		System.out.println("Static Initializer executed");
	}
	public Data(){
		System.out.println("Constructer");
	}
}


public class Application
{
//	int count=100;
	public static void main( String[] args )
	{
//		Application application= new Application();
//		System.out.println(application.count);
		
//		Data data1 = new Data();
//		Data data2 = new Data();
//		data1.value=3;
//		data2.value=5;
//		Data.value=77;
		new Data();
//		System.out.println(data1.value+"\t"+data2.value);
				
	}
}