package com.ibm.Object;

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object target) {
		if(target instanceof Point) {
			Point point2=(Point) target;
			if(this.x==point2.x&&this.y==point2.y) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return x+","+y;
	}
}

//class Test {
//	int var1, var2;
//
//	public void firstMethod(int var2) {
//		secondMethod();
//	}
//
//	private void secondMethod() {
//		int var1 = 3;
//		int var2 = 6;
//	}
//}


public class Application {
	public static void main(String[] args) {
//		Test test1 = new Test();
//		test1.firstMethod(5);
//		Test test2 = new Test();
//		test2.firstMethod(15);
		Point point1 = new Point(2,4);
		Point point2 = new Point(2,5);
		String stringPoint=point1.toString();
		System.out.println(point1);
		System.out.println(point1.equals(point2));
	}
}