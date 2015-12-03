package com.ryan.assertions.rules;

public class ValidAssertions {
	private int xx;
	String m1() {
		return "ok";
	}
	void m2(){}
	void go() {
		int x = 1;
		boolean b = true;
		
		// legal
		assert(x == 1);
		assert(b);
		assert true;
		assert (x == 1) : true;
		assert (x == 1) : m1();
		assert(x == 1) : xx;
		assert (x == 1) : new ValidAssertions();
		
		// illegal
		/*
		 * 1st expression always a boolean expression
		 * 2nd expression always return a value (String)
		assert (x = 1);
		assert (x);
		assert 0;
		assert (x == 1) : ;
		assert (x == 1) : m2();
		assert (x == 1) : int x; 
		*/
	}

	@Override
	public String toString() {
		return "hello world";
	}
}
