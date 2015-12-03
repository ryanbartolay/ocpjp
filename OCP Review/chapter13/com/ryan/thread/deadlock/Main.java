package com.ryan.thread.deadlock;

public class Main {
	public static void main(String[] args) {
		class DeadlockReadRunnable extends Thread {
			@Override
			public void run() {
				ThreadDeadlock td = new ThreadDeadlock();
				System.out.println(td.read());
			}
		}
		
		class DeadlockWriteRunnable extends Thread {

			@Override
			public void run() {
				ThreadDeadlock td = new ThreadDeadlock();
				td.write(1, 2);
				System.out.println(td.read());
			}
		}
		
		Thread t1 = new Thread(new DeadlockReadRunnable());
		Thread t2 = new Thread(new DeadlockWriteRunnable());
		t1.start();
		t2.start();
	}
}
