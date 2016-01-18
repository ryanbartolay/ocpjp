package com.ryan.enthuware.advanceoop;

abstract class Number9Abstract {
	public abstract void m1();
}
public class Number9 {

	static class InnerClass { // A nested class may be declared static.
		/*		
  		FYI, JLS defines the following terminology in Chapter 8:
		A top level class is a class that is not a nested class.
		A nested class is any class whose declaration occurs within the body of another class or interface.
		An inner class is a nested class that is not explicitly or implicitly declared static.
 		*/	
	}

	public Number9Abstract getInstance() {
		return new Number9Abstract() { // Here, the anonymous class created inside the method extends the abstract class SomeClass.

			@Override
			public void m1() {
				System.out.println("extended abstract class");
			}
		};
	}

	public static void main(String[] args) {
		Number9Abstract a = new Number9().getInstance();
		a.m1();
	}
}
