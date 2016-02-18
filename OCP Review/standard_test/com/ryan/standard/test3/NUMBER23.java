package com.ryan.standard.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class NUMBER23 extends RecursiveTask<Integer> {
	int[] ia; int from; int to;
	static final int THRESHOLD = 3;
	public NUMBER23(int[] ia, int from, int to) {
		this.ia = ia; 
		this.from = from; 
		this.to = to;
	}

	@Override
	protected Integer compute() {	
		return null;
	}
	
	public static void main(String[] args) {
		int ia[] = new int[]{ 1, 2, 3, 4 , 5, 6, 7};
		ForkJoinPool fjp = new ForkJoinPool(); 
		NUMBER23 st = new NUMBER23(ia, 0, 6);  
		int sum = fjp.invoke(st); 
		System.out.println("sum = "+sum);
	}
}
