package com.ryan.enthuware.stringprocessing;

public class Number10 {
	public static void main(String[] args) {
		String str = "Small Smaller Smallest";
		String[] not = str.split("\\s");
		System.out.println(not.length);
	}
}
