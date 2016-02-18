package com.ryan.standard.test3;

public class Number28 {
	public static void main(String[] args) {
		boolean b = false;
		assert b = true : "error here";
		
		if(b) {
			System.out.println("enabled");
		} else {
			System.out.println("disabled");
		}
	}
}
