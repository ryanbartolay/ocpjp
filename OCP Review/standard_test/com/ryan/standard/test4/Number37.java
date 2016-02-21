package com.ryan.standard.test4;

public class Number37 implements Runnable {
	int x = 0, y = 0;
	public void run() { 
		while(true) {
			x++; y++; 
			System.out.println(" x = "+x+" , y = "+y);
		}
	}
	
	public static void main(String[] args) { 
		Number37 tc = new Number37();
		new Thread(tc).start();
		new Thread(tc).start();
	}
}
