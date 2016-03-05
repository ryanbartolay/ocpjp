package com.ryan.standard.test6;
import java.util.*; 

public class Number2 {
	static String[] sa = { "charlie", "bob", "andy", "dave" };
	public static void main(String[] args) {
		Arrays.sort(sa);
		// need to be sorted before you can get the accurate answer for the search
		System.out.println(Arrays.binarySearch(sa, "charlie"));  
		for(String s : sa) {
			System.out.println(s);
		}
	}
}