package com.ryan.standard.test5;

public class Number50 {
	static class A {}
	class B {}
	public static void main(String[] args) {
		new Number50.A();
		new Number50().new B();
		new A();
		// new B(); // will not compile
	}
}
