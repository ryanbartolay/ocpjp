package com.ryan.enthuware.stringprocessing;

public class Number9 {
	public static void main(String[] args) {
		float amount = 1.234f;
		boolean flag = false;
		
		// %b boolean - If the argument arg is null, then the result is "false"
		// If arg is a boolean or Boolean, then the result is the string returned by String.valueOf(). 
		System.out.printf("%b", amount); // Otherwise, the result is "true".
		System.out.println();
		System.out.printf("%b", "false"); // Otherwise, the result is "true".
		System.out.println();
		System.out.printf("%b", true); // true
		System.out.println();
		System.out.printf("%b", false); // only false and null can make %b false
		System.out.println();
		System.out.printf("%b", null); // only false and null can make %b false
		System.out.println();
		
		System.out.printf("%f", flag); // %f expects only a decimal number thus will throw exception
	}
}
