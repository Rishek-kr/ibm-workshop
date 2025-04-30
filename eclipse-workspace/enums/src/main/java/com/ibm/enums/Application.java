package com.ibm.enums;

enum Apple{
	GoldenDel(10),
	RedDel(15),
	Gala(20);
	private int price;
	Apple(int cost){
		price=cost;
	}
	public int getPrice() {
		return price;
	}
}


public class Application
{
	public static void main( String[] args )
	{
//		Apple apple = Apple.RedDel;
//		System.out.println(apple);
//		
//		apple = Apple.valueOf("Gala");
//		System.out.println(apple);
		
//		Apple[] apples= Apple.values();
//		for (Apple apple: apples) {
//			System.out.println(apple);
//		}
		Apple[] apples= Apple.values();
		for (Apple apple: apples) {
			System.out.println(apple+" costs "+apple.getPrice());
		}
	}
}