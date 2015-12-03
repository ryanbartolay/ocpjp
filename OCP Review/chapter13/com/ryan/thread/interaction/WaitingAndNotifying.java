package com.ryan.thread.interaction;

public class WaitingAndNotifying {
	public static void main(String[] args) {
		ThreadB thread = new WaitingAndNotifying().new ThreadB();
		thread.start();

		
		System.out.println("Total : " + thread.total);
		synchronized (thread) {
			try {
				thread.wait();
				System.out.println("Waiting for notification");
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			System.out.println("Total is: " + thread.total);
		}
	}

	class ThreadB extends Thread {
		int total;
		@Override
		public void run() {
			synchronized (this) {
				for (int i = 0; i < 1000; i++) {
					total += i;
				}
				notify();
				System.out.println("Checking");
			}
		}
	}
}
