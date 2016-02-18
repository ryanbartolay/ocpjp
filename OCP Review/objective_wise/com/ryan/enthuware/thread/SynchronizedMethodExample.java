package com.ryan.enthuware.thread;

class SynchronizedMethod {
	private int counter = 0;
	
	public synchronized void increment() {
		counter++;
		System.out.println(Thread.currentThread().getName() + " " + counter);
	}
}

class LocalThread extends Thread {

	private SynchronizedMethod sync;

	public LocalThread(SynchronizedMethod sync, String name) {
		this.sync = sync;
		this.setName(name);
	}

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			sync.increment();
		}
		System.err.println("interrupted");
	}
}

public class SynchronizedMethodExample {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedMethod sync = new SynchronizedMethod();
		LocalThread a = new LocalThread(sync, "Thread A");
		LocalThread b = new LocalThread(sync, "Thread B");
		LocalThread c = new LocalThread(sync, "Thread C");

		a.start();b.start();c.start();
		//a.join();b.join();c.join();
	}
}
