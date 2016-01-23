package com.ryan.standard.test2;

import java.util.concurrent.atomic.AtomicInteger;

public class Number1 {
	public static void main(String[] args) {
		/**
		 * public final boolean compareAndSet(int expect, int update) 
		 * Atomically sets the value to the given updated value 
		 * if the current value == the expected value.
		 *  
		 * Parameters: 
		 * 		expect - the expected value 
		 * 		update - the new value 
		 * 
		 * Returns: 
		 * true if successful. 
		 * False return indicates that the actual value was not equal to the expected value.
		 */
		AtomicInteger x = new AtomicInteger(0);
		x.compareAndSet(1, 10);
		
		
		System.out.println(x);
	}
}
