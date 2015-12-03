package com.ryan.tokenizing;

import java.util.Scanner;

public class TokenizingScannerExample {
	public static void main(String[] args) {		
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[0]);
		
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
		System.out.println("------------------------------------------------------");
		
		while(s2.hasNext()) {
			if(s2.hasNextInt()) {
				System.out.println("int " + s2.next());
			} else if(s2.hasNextBoolean()) {
				System.out.println("boolean " + s2.next());
			} else if(s2.hasNextByte()) {
				System.out.println("byte " + s2.next());
			} else {
				System.out.println("default " + s2.next());
			}
		}
	}
}
