package com.ryan.concurrency.introduction;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger count = new AtomicInteger(); // atomic object

	public void increment() {
		count.getAndIncrement(); // atomic operation
	}
	public int getCount() {
		return count.get();
	}

	public void setCount(int count) {
		this.count.set(count);
	}
}
