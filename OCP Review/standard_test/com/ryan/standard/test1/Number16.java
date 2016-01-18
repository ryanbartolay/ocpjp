package com.ryan.standard.test1;

import java.util.Arrays;
import java.util.Comparator;

class Number16 implements Comparator { 
	public int compare(Object o1, Object o2) { 
		int s1 = ((String) o1).length(); 
		int s2 = ((String) o2).length(); 
		return s1 - s2; 
	}
	
	public static void main(String[] args) {
		String[] sa = { "d", "bbb","aaaa" };
		
		System.out.println(Arrays.binarySearch(sa, "c", new Number16()));
		/**
		 * There is only one string of length 1 in sa, and it is at index 0.
		 */
		
		System.out.println(Arrays.binarySearch(sa, "cc", new Number16())); // -2
		/**
		 * Since there is no string of length 2 in sa, nothing in sa matches the string "cc". 
		 * So the return value has to be negative. Further, if the value "cc" were to be inserted in sa, 
		 * it would have to be inserted after "d" i.e. at index 1. Thus, the return value 
		 * will be -(index+1) = -2.
		 */
		
		System.out.println();
		Arrays.sort(sa, new Number16());
		
		for(String s : sa) {
			System.out.println(s);
		}
	}
}
