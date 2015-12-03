package com.ryan.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Ryan");
		str.add("Joenna");
		str.add("Axxx");
		
		System.out.println(str);
		Collections.sort(str);
		
		System.out.println(str);
	}
}
