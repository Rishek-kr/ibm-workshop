package com.ibm.statics;

//class Data{
//	static public int value;
//	public int getValue() {
//		return value;
//	}
//	{
//		System.out.println("Inline");
//	}
//	static {// Static Initializer
//		value=10;
//		System.out.println("Static Initializer executed");
//	}
//	public Data(){
//		System.out.println("Constructor");
//	}
//}
class Eye{
	public float Power;
	public String Color;
}
class Human{
	public HumanEye leftEye;
	public HumanEye rightEye;
	public Human() {
		leftEye=new HumanEye();
		rightEye=new HumanEye();
	}
	static class HumanEye extends Eye{
		static int value;
	}
}
class Man extends Human{
	
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
//		new Data();
//		System.out.println(data1.value+"\t"+data2.value);
		Human.HumanEye.value=9;
	}
}