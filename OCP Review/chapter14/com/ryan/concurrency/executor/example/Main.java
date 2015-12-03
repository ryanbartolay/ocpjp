package com.ryan.concurrency.executor.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
	public static void main(String[] args) {
		
		// lets get the total processors
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		
		Runnable r = new MyRunnableTask();
		Executor ex = new NewThreadExecutor();
		ex.execute(r);
		
		/**
		 * newCachedThreadPool
		 * 
		 * this type of pool can overload system (unbounded), 
		 * if the thread inside the pool is idle for 60 seconds 
		 * then it is removed from the pool
		 * 
		 * returns ExecutorService that implements Executor
		 */
		Executor exCached = Executors.newCachedThreadPool();
		exCached.execute(r);
		
		/**
		 * newFixedThreadPool(4)
		 * 
		 * sets number of threads for processing task/s, this type of pool
		 * will not overload the system as it is bounded by the parameter 
		 * provided
		 * 
		 * returns ExecutorService that implements Executor
		 */
		ExecutorService exFixedThreadPools = Executors.newFixedThreadPool(4);
		exFixedThreadPools.execute(r);
		
		/**
		 * You can adjust the size of the fixed thread pools dynamically by
		 * casting to ThreadPoolExecutor
		 */
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		tpe.setCorePoolSize(8);
		tpe.setMaximumPoolSize(8);
		
		/**
		 * this prevents any adjustments to the number of threads in the pool
		 */
		ExecutorService exSingle = Executors.newSingleThreadExecutor();
		exSingle.execute(r);
	}
}
