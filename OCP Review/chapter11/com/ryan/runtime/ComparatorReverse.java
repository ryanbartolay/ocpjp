package com.ryan.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ComparatorReverse {
	public static void main(String[] args) {
		
		List<Integer> myNums = new ArrayList<>();
		myNums.add(123);
		myNums.add(456);
		myNums.add(789);
		
		for(Integer i : myNums) {
			System.out.println(i);
		}
		
		Comparator<Integer> revComp = Collections.reverseOrder();
		
		Collections.sort(myNums, revComp);
		
		for(Integer i : myNums) {
			System.out.println(i);
		}
		
		Set<String> strings = new HashSet<>();
		Iterator<String> xyz = strings.iterator();
		System.out.println(xyz);
		
		while(xyz.hasNext()) {
			System.out.println(xyz.next());
		}
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		for(Integer l : list) {
			System.out.println(l);
		}
	}
}
