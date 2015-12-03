package com.ryan.assertions;

public class ReallySimpleExample {
	private int y = 1;
	void m1(int x) {
		assert x > 0;
		System.out.println("condition is true :)");
	}
		
	public static void main(String[] args) {
		ReallySimpleExample r = new ReallySimpleExample();
		r.m1(2);
	}
}
