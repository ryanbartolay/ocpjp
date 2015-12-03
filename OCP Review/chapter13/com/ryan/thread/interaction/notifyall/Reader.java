package com.ryan.thread.interaction.notifyall;
public class Reader extends Thread {
	Calculator c;
	public Reader() {	}
	public Reader(Reader.Calculator c) { this.c = c; }
	@Override
	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting calculator");
				c.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Reader.Calculator calc = new Reader().new Calculator();
		new Reader(calc).start();
		new Reader(calc).start();
		new Reader(calc).start();
		new Reader(calc).start();
		
		new Thread(calc).start();
	}
	class Calculator implements Runnable {
		@Override
		public void run() {
			synchronized(this) {
				notify();
				for(int i = 1; i <= 100; ++i) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}
}
