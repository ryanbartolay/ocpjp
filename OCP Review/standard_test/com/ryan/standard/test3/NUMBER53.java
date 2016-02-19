package com.ryan.standard.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class NUMBER53 extends RecursiveTask<Integer> {
	int[] ia; int from; int to;
	static final int THRESHOLD = 3;
	public NUMBER53(int[] ia, int from, int to) {
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
		NUMBER53 st = new NUMBER53(ia, 0, 6);  
		int sum = fjp.invoke(st); 
		System.out.println("sum = "+sum);
	}
}

class NUMBER53Action extends RecursiveAction {

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}
	
}
