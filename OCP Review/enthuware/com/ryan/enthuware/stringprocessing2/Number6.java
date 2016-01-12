package com.ryan.enthuware.stringprocessing2;

public class Number6 {
	public static void main(String[] args) {
		String[] strArr = "name:john;;sex:m;;".split(";"); // will return 3
		// Trailing empty strings are therefore not included in the resulting array
		
		for(String str : strArr) {
			System.out.println("\"" + str + "\"");
		}
	}
}
