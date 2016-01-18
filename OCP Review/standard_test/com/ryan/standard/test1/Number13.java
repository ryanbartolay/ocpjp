package com.ryan.standard.test1;

public class Number13 { 
	public Mumbo mumbo = new Mumbo(); 
	public Jumbo jumbo = new Jumbo(); 
	
	class Mumbo { 
		public synchronized void doIt() {
			try{
				LINE1: wait();
			System.out.println("done");
			} catch(Exception e) { 
				
			}
		}
	}
	
	class Jumbo extends Thread {
		public void run() {
			mumbo.doIt();
		}
	}
	
	public Number13() throws Exception {
		jumbo.start(); 
		Thread.sleep(1000);
		LINE2: 
			synchronized(mumbo){ mumbo.notifyAll(); } // interrupts mumbo, must be put in synchronized block as to get the lock of the object
	}
	
	public static void main(String[] args) throws Exception {
		new Number13();
	} 
}
	
	
