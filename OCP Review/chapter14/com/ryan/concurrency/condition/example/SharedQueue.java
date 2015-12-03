package com.ryan.concurrency.condition.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedQueue {
	private List<String> sharedString = new ArrayList<>();
	private int capacity = 10;
	private Lock lock = new ReentrantLock();
	private Condition isFull = lock.newCondition();
	private Condition isEmpty = lock.newCondition();
	
	public void add(String str) throws InterruptedException {
		lock.lock();
		
		if(sharedString.size() >= capacity) {
			System.out.println("================== Queue is full ==================");
			isFull.await();
		}
		
		sharedString.add(str);
		
		isEmpty.signal(); // signal the consumers that theres already a new item in queue
		
		lock.unlock();
	}
	
	public String get() throws InterruptedException {
		lock.lock();
		
		if(sharedString.size() <= 0) {
			System.out.println("================== Queue is empty ==================");
			isEmpty.await();
		}
		
		String retString = sharedString.get(0);
		sharedString.remove(0);
		
		isFull.signal(); // signal the producer that there is already a space after remove 
		
		lock.unlock();
		return retString; 
	}
}
