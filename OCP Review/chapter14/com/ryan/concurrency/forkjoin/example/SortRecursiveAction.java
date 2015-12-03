package com.ryan.concurrency.forkjoin.example;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class SortRecursiveAction extends RecursiveAction {
	private static final int THRESHOLD = 1_000;
	private int[] data;
	private int start;
	private int end;

	public SortRecursiveAction(int[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if(end - start <= THRESHOLD) {
			Arrays.sort(data);
		} else {
			int halfWay = ((end - start) / 2) + start;
			SortRecursiveAction sort1 = 
					new SortRecursiveAction(data, start, halfWay);
			SortRecursiveAction sort2 = 
					new SortRecursiveAction(data, halfWay, end);
			invokeAll(sort1, sort2); // shortcut to fork() join()
			
			if(data[halfWay - 1] <= data[halfWay]) {
				return; // alaready sorted
			}
			
			int[] temp = new int[end - start];
			int s1 = start, s2 = halfWay, d = 0;
			
			while (s1 < halfWay && s2 < end) {
				if(data[s1] < data[s2]) {
					temp[d++] = data[s1++];
				} else if(data[s1] > data[s2]) {
					temp[d++] = data[s2++];
				} else {
					temp[d++] = data[s1++];
					temp[d++] = data[s2++];
				}
			}
		}
	}
}
