package com.ryan.standard.test2;

public class Number17 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("8");
		int i = 8;
		// the ff will not compile
		//System.out.println(8 + i + sb); // Note that + operator is overloaded only for String and not for StringBuilder
		// should be sb.toString()
	}
}
