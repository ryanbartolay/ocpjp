package com.ryan.concurrency.introduction.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadlocks {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		boolean isNotComplete = true;
		while(isNotComplete) {
			boolean isLocked1 = lock1.tryLock();
			boolean isLocked2 = lock2.tryLock();

			try {
				if(isLocked1 && isLocked2) {
					// do business
				} else {
					try {
						Thread.currentThread();
						Thread.sleep(1000);
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
				}
			} finally {
				if(isLocked1) lock1.unlock();
				if(isLocked2) lock2.unlock();
			}
		}

		// live lock is possible if thread 1 got a lock on 1 and thread 2 got a lock on 2
		// solution to this is to put random delay on each iteration
	}
}
