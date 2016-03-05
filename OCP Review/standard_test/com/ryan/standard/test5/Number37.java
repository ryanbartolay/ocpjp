package com.ryan.standard.test5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Number37 {
	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>(); 
		d.add(1);
		System.out.println(d);
		
		d.addFirst(2); // add in front
		System.out.println(d);
		
		System.out.println(d.pop()); 		
		System.out.println(d);
		
		System.out.println(d.pollFirst());
		System.out.println(d);
		
		
		d.offerFirst(3); // the same with addFirst
		System.out.println(d);
	}
}
