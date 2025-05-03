package com.ibm.Object;

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
	}
}

class Test {
	int var1, var2;

	public void firstMethod(int var2) {
		secondMethod();
	}

	private void secondMethod() {
		int var1 = 3;
		int var2 = 6;
	}
}

public class Application {
	public static void main(String[] args) {
	}
}