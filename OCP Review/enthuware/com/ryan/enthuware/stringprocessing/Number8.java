package com.ryan.enthuware.stringprocessing;

public class Number8 {
	public static void main(String[] args) {
		boolean b = true;
		int i1 = 100;
		int i2 = 200;
		double d = -23.20;
		char ch = 'm';
		String str = "hello";
		
		System.out.printf("\"%-+5d4\"", i1);
		/**
		 * - left justify
		 * + will put + if positive and - if negative
		 * % variable call
		 */
		
		System.out.println();
		System.out.printf("\"%(d+10\"", i2);
		/**
		 * ( removes the - sign from negative numbers and replace them in parentheses
		 * +10 is beyond the format specification so will do nothing
		 */
		
		System.out.println();
		System.out.printf("$%.2f", d);
		/**
		 * .2 - decimal points if put only . it will throw Exception
		 */
		
		System.out.println();
		System.out.printf("%s world", str);
		/**
		 * %s - string replace
		 */
		
		System.out.println();
		System.out.printf("%2$b %1$c", ch, b);
		/**
		 * $ - variable position
		 */
	}
}
