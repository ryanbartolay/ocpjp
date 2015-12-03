package com.ryan.arraysorting;

import java.util.Comparator;

public class StringDescendingSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.compareTo(o2) >= 1) {
			return -1;
		} else if(o1.compareTo(o2) <= -1) {
			return 1;
		} else {
			return 0;
		}		
	}

}
