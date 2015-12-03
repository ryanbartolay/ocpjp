package com.ryan.enthuware.generics;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Number15 {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		s.add("tom");
		s.add("Tom");
		s.add("Dick");
		s.add("harry");
		
		printIt(s);
	}
	
	private static void printIt(Collection<String> col) {
		for(String co : col) {
			System.out.println(co);
		}		
	}

}
