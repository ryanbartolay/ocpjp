package com.ryan.innerclass;

public class MyOuter {
	
	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		//outer.
	}
	
	class MyInner {
		static final String HELLO ="wordl";
		public void sayHello(){
			System.out.println("Hello " + HELLO);
		}
	}
}
