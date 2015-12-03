package com.ryan.enthuware.generics2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Number5 {
	public static void main(String[] args) {
		NavigableSet<String> myset = new TreeSet<String>();
		myset.add("a");
		myset.add("b");
		myset.add("c");
		myset.add("aa");
		myset.add("bb");
		myset.add("cc");
		
		for(String s : myset) {
			System.out.println(s);
		}
		
		System.out.println("\n\n");
		System.out.println(myset.floor("a"));
		System.out.println(myset.ceiling("aaa"));
		System.out.println(myset.lower("a"));
		System.out.println(myset.higher("bb"));
	}
}
