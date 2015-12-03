package com.ryan.search;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		System.out.println("input : ");
		System.out.flush();
		
		Scanner s = new Scanner(System.in);
		
		String token;
		do {
			token = s.findInLine(args[0]);
			System.out.println(token);
		} while(token != null);
		
		
	}
}
