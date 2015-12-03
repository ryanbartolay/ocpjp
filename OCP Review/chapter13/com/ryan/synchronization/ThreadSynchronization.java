package com.ryan.synchronization;

// Synchronization and locks
public class ThreadSynchronization implements Runnable {

	protected int BALANCE = 50;


	public static void main(String[] args) {
		ThreadSynchronization ts = new ThreadSynchronization();

		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);

		t1.setName("Ryan");
		t2.setName("Joenna");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " transaction started.");
		for(int i = 1; i <= 5; i++) {
			Thread.currentThread().setName(Thread.currentThread().getName() + "." + i);
			this.makeWithdrawal(10);
		}
	}

	// synchronized method to lock in per thread the usage of this method
	private synchronized void makeWithdrawal(int amount) {
		if(BALANCE <= 0) {
			System.out.println("No more credits");
			return;
		} 

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}

		this.withdraw(amount);		
	}

	protected void withdraw(int amount) {
		System.out.println("[" + Thread.currentThread().getName() + "] Before withdraw : " + BALANCE);
		BALANCE = BALANCE - amount;
		System.out.println("[" + Thread.currentThread().getName() + "] After withdraw : " + BALANCE);
	}



}
