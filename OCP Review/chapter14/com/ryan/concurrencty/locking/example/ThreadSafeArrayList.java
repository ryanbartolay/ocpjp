package com.ryan.concurrencty.locking.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeArrayList {
	private final Lock lock = new ReentrantLock();
	private final List<String> list = new ArrayList<>();
	private AtomicInteger i = new AtomicInteger(1);
	
	public AtomicInteger getI() {
		return this.i;
	}
	public int getCounter() {
		return i.get();
	}
	
	public void incrementCounter() {
		this.i.addAndGet(1);
	}
	public void add(String s) {
		lock.lock();
		try {
			list.add(s);
			System.out.println("Adding element by thread-name "
					+ "["+ Thread.currentThread().getName() +"]");
		} finally {
			lock.unlock();
		}
	}
	public Lock getLock() {
		return lock;
	}
	public List<String> getList() {
		return list;
	}
}
