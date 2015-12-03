package com.ryan.concurrency.forkjoin.example;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInitRecursiveAction extends RecursiveAction {
	
	private static final int THRESHOLD = 10_000;
	private int[] data;
	private int start;
	private int end;
	
	public RandomInitRecursiveAction(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end -1;
	}
	
	@Override
	protected void compute() {		
		if(end - start <= THRESHOLD) {
			for(int i = start; i<=end; i++) {
				data[i] = ThreadLocalRandom.current().nextInt();
			//	System.out.println(data[i]);
			}
		} else {
			int half = ((end - start) / 2) + start; 
			RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, half);
			a1.fork();
			
			RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, half, end);
			a2.compute();
			a1.join();
		}
	}
}
