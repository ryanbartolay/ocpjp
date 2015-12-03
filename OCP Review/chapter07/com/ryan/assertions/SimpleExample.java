package com.ryan.assertions;

public class SimpleExample {
	private int y = 1;
	void m1(int x, int y) {
		assert x > y : "x is " + x + " and y is " + y;
		System.out.println("condition is true :)");
	}
		
	public static void main(String[] args) {
		SimpleExample r = new SimpleExample();
		r.m1(2, 3);
	}
}
