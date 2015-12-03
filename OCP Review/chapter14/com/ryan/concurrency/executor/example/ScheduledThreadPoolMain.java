package com.ryan.concurrency.executor.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolMain {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		
		Thread t = new Thread(r);
		
		ScheduledExecutorService ftses = Executors.newScheduledThreadPool(4); 	// multi-threaded version
		
		ftses.schedule(r, 5, TimeUnit.SECONDS);									// run once after a delay
		
		ftses.scheduleAtFixedRate(r, 2, 5, TimeUnit.SECONDS);					// begin after a 2 sec delay
																				// and begin again 5 seconds after completing last execution
	}
}
