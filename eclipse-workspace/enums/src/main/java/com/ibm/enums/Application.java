package com.ibm.enums;
enum Apple{
	GoldenDel,
	RedDel,
	Gala
}

public class Application
{
	public static void main( String[] args )
	{
		Apple[] apples= Apple.values();
		for (Apple apple: apples) {
			System.out.println(apple);
		}
	}
}