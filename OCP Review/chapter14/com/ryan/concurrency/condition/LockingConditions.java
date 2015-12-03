package com.ryan.concurrency.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingConditions {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();		
		Condition blockingPoolA = lock.newCondition();
		
		// Thread 1
		lock.lock();
		
		try {
			blockingPoolA.await(); 	// wait here
									// lock will be acquired
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {					// to ensure we unlock
			lock.unlock();			// must manually release
		}
		
		
		// Thread 2
		lock.lock();
		
		try {
			blockingPoolA.signalAll(); 	// similar with notify 
										// wake all waiting threads
		} finally {						// to ensure we unlock
			lock.unlock();				// must manually release
		}
	}
}
