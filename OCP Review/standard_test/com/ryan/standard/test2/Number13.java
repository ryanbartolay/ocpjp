package com.ryan.standard.test2;

public class Number13 {
	public static void main(String[] args) {
		boolean b = true;
		int i1 = 100;
		int i2 = -200;
		double d = -23.20;
		char ch = 'm';
		String str = "hello";
		
		System.out.printf("\"%-+5d4\"", i1); // "+100 4"
		System.out.printf("\n\"%(d+10\"", i2); // "(200)+10"
		System.out.printf("\n\"$%.2f\"", d); // "$-23.20"
		System.out.printf("\n\"%s world\"", str); // "hello world"
		System.out.printf("\n\"%2$c + %1$d\"", i1, ch); // "m + 100"
	}
}
