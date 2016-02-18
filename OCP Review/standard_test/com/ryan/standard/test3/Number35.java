package com.ryan.standard.test3;

public class Number35 {
	static int i1, i2, i3; 
	
	public static void main(String[] args) {
		try {
			System.out.println(test(i1 = 1, oops(i2=2), i3 = 3)); // this is allowed assign and passing parameters at the same time
		} catch (Exception e) { 
			System.out.println(i1+" "+i2+" "+i3);
		}
	}
	static int oops(int i) throws Exception { 
		throw new Exception("oops");
	}
	static int test(int a, int b, int c) { 
		return a + b + c;
	}
}
