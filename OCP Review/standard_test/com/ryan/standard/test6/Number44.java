package com.ryan.standard.test6;

public class Number44 {
	public static void main(String[] args) {
		String[] a = "name:john;;sex:m;;".split(";");
		// no space is included in the string array
		System.out.println(a.length);
		for(String x : a) {
			System.out.println(x);
		}
	
	}
}
