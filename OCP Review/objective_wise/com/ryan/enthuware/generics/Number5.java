package com.ryan.enthuware.generics;

public class Number5 {
	// class java.lang.Void is standard java class
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class c1 = Test1.class.getMethod("Testt",null).getReturnType();

		
		System.out.println(c1);
		System.out.println(Void.TYPE);
		System.out.println(Void.class);
	}
}

class Test1 {
	public void Testt(){}
}