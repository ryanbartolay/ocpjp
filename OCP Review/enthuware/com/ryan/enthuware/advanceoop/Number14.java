package com.ryan.enthuware.advanceoop;

public class Number14 {
	private static String n = "name";
	int i = 10;
	class Inner
	{
		String i = "ryan";
		public void methodA()
		{
			// can access i
			System.out.println(i); // ryan
			System.out.println(Number14.this.i); // 10
			
			// can access static
			System.out.println(Number14.this.n);
			System.out.println(n);
			System.out.println(Number14.n);			
			
			// cannot access i / n
			//System.out.println(this.i);
			//System.out.println(this.n);
		}
	}
	
	public static void main(String[] args) {
		new Number14().new Inner().methodA();
		System.out.println(Number14.n);
	}
}
