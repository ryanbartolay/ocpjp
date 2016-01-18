package com.ryan.standard.test1;

public class Number04 extends Thread {
	
	volatile boolean isSmall = true;
	
	public synchronized void doALotOfStuff() {
		//System.out.println("DONE");
		try { 
			LINE1: Thread.sleep(10000);
		}catch(Exception e) {
			
		}
	} 
	
	public synchronized void doSmallStuff() {
		System.out.println("done");
	}
		
	
	@Override
	public synchronized void start() {
		if(isSmall) {
			this.doALotOfStuff();
		} else {
			this.doSmallStuff();
		}
	}

	public static void main(String[] args) {
		Number04 n = new Number04();
		n.start();
		
		Number04 m = new Number04();
		m.isSmall = false;
		m.start();
		
	}
}
