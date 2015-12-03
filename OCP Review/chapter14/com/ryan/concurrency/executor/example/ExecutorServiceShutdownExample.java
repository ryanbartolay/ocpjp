package com.ryan.concurrency.executor.example;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceShutdownExample implements Callable<String> {
	public static void main(String[] args) {
		
		
		ExecutorService eService = Executors.newCachedThreadPool();
		
		Future<String> f = eService.submit(new ExecutorServiceShutdownExample());
		
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		eService.shutdown();
		
		try {
			boolean term = eService.awaitTermination(2, TimeUnit.SECONDS);		// wait 2 seconds for running tasks to finish
		} catch (InterruptedException e) {
			// didnt wait the full 2 seconds 
		} finally {
			if(!eService.isTerminated()) {
				List<Runnable> unfinished = eService.shutdownNow();
			}
		}
	}

	@Override
	public String call() throws Exception {
		return "Ryan";
	}
}
