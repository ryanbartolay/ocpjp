package com.ryan.synchronization.exercise;

public class Main {
	public static void main(String[] args) {
		ExerciseSynchronization es = new ExerciseSynchronization(new StringBuffer());
		
		Thread t1 = new Thread(es);
		Thread t2 = new Thread(es);
		Thread t3 = new Thread(es);
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
