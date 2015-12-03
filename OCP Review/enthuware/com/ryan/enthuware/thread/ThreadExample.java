package com.ryan.enthuware.thread;

public class ThreadExample extends Thread implements Runnable {
	String msg = "default";
	
	public ThreadExample(String msg) {		
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(msg);		
	}
	
	public static void main(String[] args) {
		new Thread(new ThreadExample("String1")).run(); // the new Thread inside will become the instantiated object
		new Thread(new ThreadExample("String2")).run();
		System.out.println("end");		
	}
}
