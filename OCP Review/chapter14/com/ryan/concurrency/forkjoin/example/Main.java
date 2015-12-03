package com.ryan.concurrency.forkjoin.example;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		int[] data = new int[10_000_000];
		ForkJoinPool pool = new ForkJoinPool();
		RandomInitRecursiveAction action = 
				new RandomInitRecursiveAction(data, 0, data.length);
		pool.invoke(action);
		
		
		FindMaxPositionRecursiveTask task = 
				new FindMaxPositionRecursiveTask(data, 0, data.length);
		int position = pool.invoke(task);
		System.out.println("Position : " + position + 
				" value : " + data[position]);
	}

}
