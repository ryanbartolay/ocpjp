package com.ryan.standard.test3;

public class Number63 {
	public static void main(String[] args) {
		System.out.printf("\"%-5c\"", 'c');
//		System.out.printf("\"%+0d\"", 100); // will throw exception as + causes padding
		System.out.printf("\"%+05d\"", 100); // this is the correct way to do
		System.out.printf("\"$%(,9.2f\"", -1222.2);
		System.out.printf("%b", 100);
		System.out.printf("\"%c\"", new Character('d'));
		System.out.printf("%s", new Object());
//		System.out.printf("\"%f\"", -100); // f - is strictly for floating points
		System.out.printf("\"%f\"", -100.23);
	}
}
