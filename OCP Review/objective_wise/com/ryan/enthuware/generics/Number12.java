package com.ryan.enthuware.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Number12 {
	static String[] sa = { "d", "bbb", "aaaa" };
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.binarySearch(sa, "cc", new Number12AlphabeticalComparator()));
		System.out.println(Arrays.binarySearch(sa, "c", new Number12Comparator()));
	}
}

class Number12AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}



class Number12Comparator implements Comparator {
	public int compare(Object o1, Object o2) {
		int s1 = ((String) o1).length();
		int s2 = ((String) o2).length();
		return s1 - s2;
	}
}
