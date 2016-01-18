package com.ryan.enthuware.generics2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Number6 {
	public static void main(String[] args) {
		// Deque can act as a Queue as well as a Stack 
		// Stack is a 
		// LIFO structure (i.e. add to the front and remove from the front).
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		d.push(2);
		d.push(3);
		System.out.println(d.remove()); // throws exception if empty
		System.out.println(d.remove()); // throws exception if empty
		System.out.println(d.remove()); // throws exception if empty
		
		// Queue
		// FIFO structure (i.e. add to the end and remove from the front).
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll());  // return false if empty
		System.out.println(q.remove()); // throws exception if empty
		System.out.println(q.remove()); // throws exception if empty
	}
}
