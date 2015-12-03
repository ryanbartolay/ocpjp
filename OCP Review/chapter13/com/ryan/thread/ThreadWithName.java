package com.ryan.thread;

class ThreadWithNameSub implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class ThreadWithName {
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadWithNameSub());
		t.setName("Thread Name");
		t.start();
	}
}
