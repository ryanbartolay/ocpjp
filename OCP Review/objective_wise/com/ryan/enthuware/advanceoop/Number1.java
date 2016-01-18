package com.ryan.enthuware.advanceoop;

public class Number1 { 
	public class Aa { void m1() { System.out.println("hello world"); } }
	public static class B {}
	
	public void useClasses() {
		
		// the method useClasses() is an instance method. So, it already 
		// has instance of outer class associated with it. new A(); is also valid. new TestClass.A(); is same as new A().
		new Number1.Aa();
		new Number1.B();
		new Aa();
		new B();
		new Number1().new Aa();
		// new Number1().new B(); // static 
	}
}

class OutsideCall {
	public static void main(String[] args) {
		// new Number1.A(); // not valid because there's no instance of Number1
		new Number1.B();
		// new Aa();// not valid because there's no instance of Number1
		//new B(); // static call should be through the outer class
		new Number1().new Aa();
		// new Number1().new B(); // static 
	}
}
