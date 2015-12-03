package com.ryan.concurrency.condition.example;

import com.ryan.utility.RandomString;

public class Producer implements Runnable {

	private SharedQueue queue = null;
	private RandomString randomString = new RandomString(13);	
	private final int total = 1000;
	
	public Producer(SharedQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		int i = 1;
		String str = "";
		while(1 <= total) {
			str = randomString.nextString();
			try {
				queue.add(str);
				System.out.println("[" + Thread.currentThread().getName() + "] " + str);
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			++i;
		}
	}
	
}
