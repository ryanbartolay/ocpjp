package com.ryan.concurrency.readwrite.locking.example;

import java.util.concurrent.ThreadLocalRandom;

public class Game implements Runnable {

	private Scoring scoring;
	
	public Game(Scoring scoring) {
		this.scoring = scoring;
	}
	
	@Override
	public void run() {
		int i = 1;
		while(i < 50) { 
			try {
				scoring.addScore(ThreadLocalRandom.current().nextInt(1, 10 + 1));
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}

}
