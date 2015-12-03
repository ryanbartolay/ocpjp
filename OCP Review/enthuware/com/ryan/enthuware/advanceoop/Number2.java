package com.ryan.enthuware.advanceoop;

public class Number2 {
	
	private String a = "a";
	String b = "b";
	protected String c = "c";
	public String d = "d";
	static String e = "e";
	private static final String f = "f";
	
	class InnerNumber2 extends Number2 { // An inner class can extend its outer class.
		void m1() { System.out.println("hey"); }
		
		void m2() {
			// Member variables of the outer instance are always accessible to inner instances, regardless of their accessibility modifiers.
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
		}
	}
	
	class InnerNumber2a {
		void m2() { System.out.println("hey2"); }
	} 
	
}

class MainNumber2 {
	public static void main(String[] args) {
		// More than one inner instance can be associated with the same outer instance.
		Number2 n = new Number2().new InnerNumber2(); // allowed as it extends Number2
		
		((Number2.InnerNumber2)n).m1();
		
		Number2.InnerNumber2 nn = new Number2().new InnerNumber2();
		nn.m2();
		
		// Member variables of the outer instance are always accessible to inner instances, regardless of their accessibility modifiers.
		//System.out.println(nn.a);
		System.out.println(nn.b);
		System.out.println(nn.c);
		System.out.println(nn.d);
		System.out.println(nn.e);
	}
}
