package com.ryan.concurrency.condition.example;

public class Consumer implements Runnable {

	private SharedQueue queue = null;
	
	public Consumer(SharedQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[" + Thread.currentThread().getName() + "] " + queue.get());
				Thread.sleep(5000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}			
		}
	}

}
