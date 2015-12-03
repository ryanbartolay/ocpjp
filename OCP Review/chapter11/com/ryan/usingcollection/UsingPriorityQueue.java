package com.ryan.usingcollection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UsingPriorityQueue {
	static class PQSort implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	}
	public static void main(String[] args) {
		int[] ia = {1,5,3,7,6,9,8};
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		
		for(int x : ia) {
			pq1.offer(x);
		}
		
		for(int x : ia) {
			System.out.print(pq1.poll());
		}
		System.out.println();
		PQSort pqSort = new PQSort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, pqSort);
		
		for(int x : ia) {
			pq2.offer(x);
		}
		System.out.println();
		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());
		System.out.println();
		for(int x : ia) {
			System.out.print(pq2.poll() + " ");
		}
	}
}
