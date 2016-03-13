package com.ryan.standard.test7;

public class Number13 {
	static int i = 10;
	
	static class Inner	{
		int b = 20;
		public void methodA()
		{
			System.out.println(new Number13().i);
			System.out.println(i);
			System.out.println(b);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		Number13.Inner inst = new Number13.Inner();
		inst.methodA();
	}
}
