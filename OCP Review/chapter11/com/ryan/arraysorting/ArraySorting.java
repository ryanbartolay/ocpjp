package com.ryan.arraysorting;

import java.util.Arrays;

public class ArraySorting {
	private static StringDescendingSort ss = new StringDescendingSort();
	public static void main(String[] args) {
		String[] x = {"ryan", "Alexis", "joaquin"};
		arrayPrint(x);
		Arrays.sort(x); // natural string sort
		arrayPrint(x);
		Arrays.sort(x, ss); // string sort descending, custom
		arrayPrint(x);
	}
	
	public static void arrayPrint(String[] arr) {
		for(String a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
