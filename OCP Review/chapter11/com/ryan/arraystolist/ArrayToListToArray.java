package com.ryan.arraystolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListToArray {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		strs.add("Ryan");
		strs.add("Kristoffer");
		strs.add("Ryan");		
		strs.add("Bartolay");
		
		System.out.println(strs);		
		
		String[] sss = new String[strs.size()];
		strs.toArray(sss); // convert list to array
		
		for(Object s : sss) {
			System.out.println(s.toString());
		}
		
		System.out.println(Arrays.asList(sss)); // convert array to list again
	}
}
