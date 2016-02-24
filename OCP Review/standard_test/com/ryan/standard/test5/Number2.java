package com.ryan.standard.test5;

class A { } 
public class Number2{ 
	public class A { 
		public void m() { 
			
		} 
	}
	class B extends A { 
		
	}
	
	public static void main(String args[]) {
		new Number2().new B(); // only to create B as non static inner class
		
		new Number2().new A() {
			public void m() { } 
		};
	} 
}
