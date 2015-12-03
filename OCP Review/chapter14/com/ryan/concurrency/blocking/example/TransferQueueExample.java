package com.ryan.concurrency.blocking.example;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {
	private static TransferQueue<String> q;

	public static void main(String[] args) throws InterruptedException {		
		q = new LinkedTransferQueue<>(); 	// not bounded

		// producing
		
		boolean b1 = q.add("Ryan"); 		// throws exception if bounded and full

		q.put("Ryan");						// blocks if bounded and full

		boolean b3 = q.offer("Kristoffer");	// same as add but doesn't throw exception

		boolean b4 = q.offer("entry string", 10, TimeUnit.SECONDS); 	// same as offer but is time bound, 
									// 	false if not inserted within 10 seconds

		q.transfer("for consume");	// will block until consume

		boolean b6 = q.tryTransfer("try transfer this");				// false if no awaiting consumer

		boolean b7 = q.tryTransfer("try transfer this", 10, TimeUnit.SECONDS); // will wait for consumer

		// consuming

		String c1 = q.element();	// gets without removing, throws NoSuchElementException

		String c2 = q.peek();		// same with element but returns null on empty

		String c3 = q.poll();		// gets and remove entry, return null if empty

		String c4 = q.poll(10, TimeUnit.SECONDS);	// same as poll but wait before returning null

		String c5 = q.remove();		// same as poll, but throws NoSuchElementException if empty

		String c6 = q.take();		// same as poll, but blocks until an element is ready
	}
}
