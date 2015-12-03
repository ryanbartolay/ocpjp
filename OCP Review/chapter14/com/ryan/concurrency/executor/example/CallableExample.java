package com.ryan.concurrency.executor.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class CallableExample implements Callable<Integer> {
	
	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(4);
		
		Future<Integer> f = exService.submit(new CallableExample());
		
		Integer v;
		try {
			v = f.get(); // blocks until done
			System.out.println("Ran : " + v);
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Failed");
		}
	}

	@Override
	public Integer call() throws Exception {
		int count = ThreadLocalRandom.current().nextInt(1, 11);
		for(int i = 1; i <= count; i++) {
			System.out.println("Running " + i);
		}
		return count;
	}
}
