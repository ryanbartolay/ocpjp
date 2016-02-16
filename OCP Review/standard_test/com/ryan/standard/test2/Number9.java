package com.ryan.standard.test2;

public class Number9 {
	
	public static void main(String[] args) {
		String s = "going";
		print(s,s = "gone"); // can assign and pass parameter at the same time
		System.out.println(s);
	}
	
	static void print(String a, String b) {
		System.out.println(a +", "+ b );
	}
}
