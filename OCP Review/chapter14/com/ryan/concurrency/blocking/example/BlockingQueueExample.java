package com.ryan.concurrency.blocking.example;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
	private static LinkedBlockingQueue<String> queue;
	
	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();
		queue.add("Ryan");
	
	}
}
