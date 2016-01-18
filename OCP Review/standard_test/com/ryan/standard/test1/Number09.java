package com.ryan.standard.test1;

import java.util.concurrent.atomic.AtomicInteger;

public class Number09 {
	public static void main(String[] args) {
		AtomicInteger count = new AtomicInteger(0);		
		count.incrementAndGet();
		
		System.out.println(count.intValue());
	}
}
