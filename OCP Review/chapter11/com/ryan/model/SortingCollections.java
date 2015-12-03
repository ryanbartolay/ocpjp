package com.ryan.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {
	public static void main(String[] args) {
		List<User> str = new ArrayList<>();
		str.add(new User(6, "Ryan"));
		str.add(new User(2, "Joenna"));
		str.add(new User(9, "Axxx"));
		NameSort ns = new NameSort();
		System.out.println(str);
		Collections.sort(str); // comparable sort
		System.out.println(str); 
		Collections.sort(str, ns); // comparator sort
		System.out.println(str);
	}
}
