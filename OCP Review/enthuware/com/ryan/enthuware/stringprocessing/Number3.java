package com.ryan.enthuware.stringprocessing;

public class Number3 {
	public static void main(String[] args) {
		System.out.printf("%1$s %2$s %s %s", "A", "B", "C");
		// will print A B A B C RuntimeException
		// if you didnt specify a parameter index it will use natural index starting 1
		// so it will print A B A B A C
		System.out.println();
		System.out.printf("xxx%1$dyyy%2$dzzz", 10, 20);
		System.out.println();
		System.out.printf("%(,010d", -10011);
		System.out.println();
		System.out.printf("%+,f", -10011.123);
	}
}
