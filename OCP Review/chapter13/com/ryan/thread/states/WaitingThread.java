package com.ryan.thread.states;

public class WaitingThread {
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		t.start();
		
	}
}
