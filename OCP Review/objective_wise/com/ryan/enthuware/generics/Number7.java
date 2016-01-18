package com.ryan.enthuware.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Number7 {
	static String[] sa = { "aaaa", "aaa", "aa", "a" };
	/*static { 
		Arrays.sort(sa);
	}*/
	
	public static void main(String[] args) {
		String search = "a";
		if(args.length != 0) 
			search = args[0];
		
		StringDescendingSorting sort = new StringDescendingSorting();
		Arrays.sort(sa, sort);
		
		System.out.println(Arrays.binarySearch(sa, search, sort));
	}
}

class StringDescendingSorting implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
