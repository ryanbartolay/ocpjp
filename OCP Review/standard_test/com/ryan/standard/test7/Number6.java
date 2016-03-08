package com.ryan.standard.test7;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Number6 {
	public static void main(String[] args) {
		NavigableSet<String> myset = new TreeSet<>();
		myset.add("a");
		myset.add("b");
		myset.add("c");
		myset.add("aa");
		myset.add("bb");
		myset.add("cc");
		
		Iterator<String>it = myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println(myset.floor("a"));
		System.out.println(myset.ceiling("aaa"));
		System.out.println(myset.lower("a"));
		System.out.println(myset.higher("bb"));
	}
}
