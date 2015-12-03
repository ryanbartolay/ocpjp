package com.ryan.concurrency.introduction.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();// waits until lock is acquired
		
		try {
			// do business
		} finally {
			lock.unlock();
		}
	}
}
