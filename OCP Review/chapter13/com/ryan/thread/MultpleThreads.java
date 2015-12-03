package com.ryan.thread;

import java.util.LinkedList;
import java.util.List;

public class MultpleThreads {
	public static void main(String[] args) {
		Runnable r = new CreatingThread();
		
		List<Thread> threads = new LinkedList<>();
		Thread t = null;
		
		for(int i = 1; i <= 10; i++) {
			t = new Thread(r);
			t.setName("t" + i);
			threads.add(t);
		}
		
		for(Thread thread : threads) {
			System.out.println(thread.getName());
		}
		
		for(Thread thread : threads) {
			thread.start();
		}
		
	}
}
