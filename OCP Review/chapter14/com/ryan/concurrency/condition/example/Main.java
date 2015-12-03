package com.ryan.concurrency.condition.example;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		SharedQueue queue = new SharedQueue();
		Thread producer = new Thread(new Producer(queue), "producer-1");
		Thread producer2 = new Thread(new Producer(queue), "producer-2");
		
		Thread consumer = new Thread(new Consumer(queue), "consumer-1");

		producer.start();
		producer2.start();
		consumer.start();
	}

}
