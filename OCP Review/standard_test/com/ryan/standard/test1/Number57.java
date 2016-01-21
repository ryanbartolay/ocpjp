package com.ryan.standard.test1;

class Resource { 
	public String data = "DATA"; 
}  

class Looney implements Runnable { 
	Resource r; int number; 
	public Looney(Resource r, int number) { 
		this.r = r;
		this.number = number;
	}  
	public void run(){ 
		synchronized(r) {
			r.data = "DATA "+number;
			r.notifyAll();
			r.data = "DATA";
		}
	}
}

public class Number57 {  
	public static void main(String[] args) {
		Resource r = new Resource(); 
		Looney l = new Looney(r, 1);
		Thread t = new Thread(l);
		t.start(); 
		synchronized(r) {
			System.out.println(r.data);
		}
	}  
}