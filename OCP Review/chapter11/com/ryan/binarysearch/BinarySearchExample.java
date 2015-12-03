package com.ryan.binarysearch;

import java.util.Arrays;
import java.util.Comparator;

import com.ryan.arraysorting.ArraySorting;

public class BinarySearchExample {
	public static void main(String[] args) {
		String[] x = {"Ryan", "Alex", "Bilb"};
		Arrays.sort(x); // before binary search you need to sort
		System.out.println(Arrays.binarySearch(x, "Ryan")); // will print out -4 if you didnt sort
		ArraySorting.arrayPrint(x);
		
		StringDescendingSort sd = new StringDescendingSort();
		Arrays.sort(x, sd);
		ArraySorting.arrayPrint(x);
		System.out.println(Arrays.binarySearch(x, "Ryan"));
		System.out.println(Arrays.binarySearch(x, "Ryan", sd));
		
		Arrays.sort(x, new StringAscendingSort()); // custom comparator but behavior is natural
		ArraySorting.arrayPrint(x);
		System.out.println(Arrays.binarySearch(x, "Ryan"));
	}
	
	static class StringDescendingSort implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}
	static class StringAscendingSort implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	}
}
