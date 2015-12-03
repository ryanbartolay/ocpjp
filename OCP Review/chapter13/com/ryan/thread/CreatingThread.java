package com.ryan.thread;


/**
 * create thread by 
 * 	implementing java.lang.Runnable 
 * 	or 
 * 	extending java.lang.Thread
 * @author Ryan Bartolay
 */
public class CreatingThread implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1; i <= 300; i++) {
			System.out.println("Thread name ["+ i +"]: " + Thread.currentThread().getName());
		}
	}

}

class CreatingThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
