package com.ryan.tokenizing;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "123,14,5as v,saw,799959";
		StringTokenizer st = new StringTokenizer(str);
		// default delimiter is whitespace
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("-------------------------------------");
		
		StringTokenizer st2 = new StringTokenizer(str, ",");
		
		System.out.println(st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
