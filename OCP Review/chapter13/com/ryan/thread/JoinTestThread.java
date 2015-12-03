package com.ryan.thread;

public class JoinTestThread {
	public static void main(String[] args) {
		Thread t = new Thread(new CreatingThread());
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
