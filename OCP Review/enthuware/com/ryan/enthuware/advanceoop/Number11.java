package com.ryan.enthuware.advanceoop;

class A { } 
public class Number11 { 
	public class A {
		public void m() { }
	}
	
	class B extends A { }
	
	// static class C extends B {} // static inner class cannot extend
	
	static class D {}
	
	public static void main(String args[]) { 
		new Number11().new A() { 
			public void m() { 
				System.out.println("ryen");
			}
		}.m();
		
		// new B(); // cannot be access from this point
		new D(); // accessible
		new Number11.D(); // the same
	}
}
