package com.ryan.enthuware.advanceoop;

public class Number10 {
	class Inner { // Non-static inner class can have static members.
		final int x = 1; // They can have final fields
		static final int a = 0; // but the static fields have to be final constants.
	}
	
	static class StaticInner {
		
	}
	
	void m() {}
	
	public static void main(String[] args) {
		// Objects of static nested classes can be created without creating instances of their Outer classes.
		Number10.StaticInner x = new Number10.StaticInner();
		
		new Number10() { // Anonymous classes cannot be static.

			// Number10 { } // Anonymous classes cannot define constructors explicitly in Java code.
			
			@Override
			void m() {				
				super.m();
			}
		};
	}
}
