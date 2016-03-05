package com.ryan.standard.test5;

import java.util.concurrent.atomic.AtomicInteger;

public class Number1 {
	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(0);
		
		ai.incrementAndGet();
		ai.addAndGet(12);
		System.out.println(ai);
	}
}
