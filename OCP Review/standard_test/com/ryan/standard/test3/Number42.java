package com.ryan.standard.test3;

public class Number42 extends Thread {

	private static int threadcounter = 0;
	public synchronized void run() {
		threadcounter++;
		System.out.println(threadcounter);
	}

	public static void main(String[] args) throws Exception { 
		for(int i=0; i<5; i++) {
			new Number42().start(); 
		} 
		System.out.println(threadcounter+" DONE");
	}
}
