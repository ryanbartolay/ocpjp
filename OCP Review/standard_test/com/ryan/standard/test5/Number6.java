package com.ryan.standard.test5;

import java.util.TreeSet;

enum SIZE {
	TALL, JUMBO, GRANDE;
}
public class Number6 {
	public static void main(String[] args) {
		TreeSet<SIZE> a = new TreeSet<>();
		a.add(SIZE.GRANDE);
		a.add(SIZE.JUMBO);		
		a.add(SIZE.TALL);
		
		System.out.println(a); // NATURAL order of enum is the order in which how they are defined 
	}
}
