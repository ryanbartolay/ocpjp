package com.ryan.enthuware.thread2;

public class Number1 extends Thread {
	public void run() {
		for(;;);
	}
	public static void main(String args[]) throws InterruptedException { 
		System.out.println("Starting Main");
		Thread a = new Number1();
		a.start();
		a.join();
		System.out.println("Main returns");
	} 
}
