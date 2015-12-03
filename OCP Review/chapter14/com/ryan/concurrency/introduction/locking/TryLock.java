package com.ryan.concurrency.introduction.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		boolean isLocked = lock.tryLock();
		
		if(isLocked) {
			try {
				// do business
			} finally {
				lock.unlock();
			}
		}
	}
}
