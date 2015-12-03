package com.ryan.thread;

class TestThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hey Jude");
	}
}

public class CallingAThread {
	 public static void main(String[] args) {
		Thread x = new Thread(new CreatingThread());
		x.start();
		
		Thread y = new TestThread();
		y.start();
	}
}
