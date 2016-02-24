package com.ryan.standard.test5;

class Hello implements Runnable{ 
	int i; 

	public void run(){ 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e){

		} 
		i = 20; 
	} 
} 

public class Number43 { 
	static public void main(String[] args) throws Exception{ 
		Hello h = new Hello(); 
		Thread t = new Thread(h); 
		t.start();

		// h.notify();
		// t.yield();
		//t.join();
		
		System.out.println("h.i = " + h.i); 
	} 
}
