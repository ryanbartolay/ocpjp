package com.ryan.tokenizing;

public class TokenizingExample {
	public static void main(String[] args) {
		String source = "123,14,5asv,saw,799959";
		
		String[] tokens = source.split(",", 3);
		
		for(String token : tokens) {
			System.out.println(token); 
		}
	}
}
