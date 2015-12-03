package com.ryan.synchronization;

public class SynchronizedBlock extends ThreadSynchronization {
	public static void main(String[] args) {
		ThreadSynchronization ts = new SynchronizedBlock();
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);

		t1.setName("Ryan");
		t2.setName("Ryan2");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {

		for(int i = 1; i<= 10; ++i) {
			synchronized(this) { // non-static synchronized block
				if(BALANCE <= 0) {
					System.out.println("[" + Thread.currentThread().getName() + "] No more credits");
					return;
				} 

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {		
					e.printStackTrace();
				}

				this.withdraw(10);	
			}
		}
	}
	
	// static method with synchronization
	private static synchronized void doSomething() {
		System.out.println("Im Doing Something");
	}
	// is equivalent to 
	private static void doSomething2() throws ClassNotFoundException {
		synchronized (ThreadSynchronization.class) { // the SynchronizedBlock.class is called class literal
			
		}
		
		Class cl = Class.forName("SynchronizedBlock");
		System.out.println(cl);
		
		synchronized (cl) {
			
		}
	}
}