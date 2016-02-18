package com.ryan.enthuware.thread;

class SampleSync {
	public Integer x = 0;

	public void increment() {
		synchronized (this) {
			for(int i = 0; i<5; i++) {
				x++;
				System.out.println(x);
			}
		}
	}
}

class SynchronizedPropertyExampleLocalThread extends Thread implements Runnable {

	public SynchronizedPropertyExampleLocalThread(SampleSync sync, String name) {
		this.sync = sync;	
		this.setName(name);
	}

	private SampleSync sync;

	@Override
	public void run() {
		System.out.println(this.getName());
		sync.increment();
	}
}
public class SynchronizedBlockExample {


	public static void main(String[] args) {
		SampleSync sync = new SampleSync();

		Thread a = new SynchronizedPropertyExampleLocalThread(sync,"Thread A");
		Thread b = new SynchronizedPropertyExampleLocalThread(sync,"Thread B");
		Thread c = new SynchronizedPropertyExampleLocalThread(sync,"Thread C");
		a.start();b.start();c.start();
	}
}
