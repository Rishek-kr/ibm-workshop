package com.ibm.statics;
class Data{
	static public int value;
	
}

public class Application
{
	public static void main( String[] args )
	{
		Data data1 = new data1();
		Data data2 = new data2();
		data1.value=3;
		data2.value=5;
		Data.value=77;
		System.out.println(data1.value+"\t"+data2.value);
				
	}
}