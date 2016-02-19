package com.ryan.standard.test4;

public class Number12 extends Thread {
	private int data = 0;
	private boolean done = false;

	public Number12(int x){ 
		super(); this.data = x;
	}

	public synchronized int getData(){ 
		return data;
	}

	public synchronized boolean isDone(){ 
		return done; 
	} 

	public synchronized void run() {
		data += data;
		done = true;
	}

	public static void main(String[] args) throws Exception { 
		Number12[] jta = new Number12[3];
		for(int i=0; i<3; i++) { 
			jta[i] = new Number12(i); jta[i].start(); 
		}

		for(Number12 jt : jta) {
			if(jt.isDone()) 
				System.out.println(jt.getData());
		}
	}
}