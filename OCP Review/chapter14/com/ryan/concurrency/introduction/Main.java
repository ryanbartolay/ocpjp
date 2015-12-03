package com.ryan.concurrency.introduction;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new IncrementerThread(counter);
		Thread t2 = new IncrementerThread(counter);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}
}