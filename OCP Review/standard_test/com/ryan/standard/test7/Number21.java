package com.ryan.standard.test7;

public class Number21 {
	void probe(Object x) {
		System.out.println("In Object");
	}

	void probe(Number x) {
		System.out.println("In Number");
	}

	void probe(Integer x) {
		System.out.println("In Integer");
	}

	void probe(Long x) {
		System.out.println("In Long");
	}

	public static void main(String[] args) {
		double a = 10;
		new Number21().probe(a);
	}
}
