package com.ryan.concurrencty.locking.example;

public class Main {
	public static void main(String[] args) {
		final ThreadSafeArrayList tArrayList = new ThreadSafeArrayList();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (tArrayList.getCounter() < 6) {
					System.out.println(tArrayList.getCounter());
					tArrayList.add(String.valueOf(tArrayList.getCounter()));
					tArrayList.incrementCounter();
				}
								
			}
		}, "Ryan #1");
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (tArrayList.getCounter() < 6) {
					tArrayList.add(String.valueOf(tArrayList.getCounter()));
					tArrayList.incrementCounter();
				}
								
			}
		}, "Ryan #2");
		
		thread1.start();
		thread2.start();
	}
}
