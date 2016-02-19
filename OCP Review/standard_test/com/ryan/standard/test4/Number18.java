package com.ryan.standard.test4;

class A {}	
class B extends A {}
class C extends B {}
class D extends C {}

public class Number18 {
	public static void main(String[] args) {
		B obj = new B();
		
		System.out.println(obj instanceof A);
		System.out.println(! (obj instanceof C));
		System.out.println(! (obj instanceof D)); 
	}
}
