package com.ryan.standard.test3;

class Number31A extends Thread {
	public void run() { 
		System.out.println("Starting loop");
		
		while(true) { 
			System.out.println("running thread");
			
			if(isInterrupted()) {
				System.out.println("this is interrupted");
				break;
			}
		}
	}
}

public class Number31 {
	public static void main(String[] args) throws InterruptedException {
		Number31A a = new Number31A();
		a.start();
		Thread.sleep(1000);
		a.interrupt(); // thread interrupt puts the interrupted flag to TRUE
	}
}
