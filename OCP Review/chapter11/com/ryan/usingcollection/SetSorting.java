package com.ryan.usingcollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {
	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>(); // natural order (order by index)
		nums.add(9234);
		nums.add(65234);
		nums.add(1224);
		nums.add(1_234);
		nums.add(1255534);
		nums.add(5555);
		
		System.out.println(nums);
		
		Set<Integer> nums2 = new TreeSet<>(nums); // order by value or custom comparator
		System.out.println(nums2);
	}
}
