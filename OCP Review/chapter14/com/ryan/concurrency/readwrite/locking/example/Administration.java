package com.ryan.concurrency.readwrite.locking.example;

public class Administration implements Runnable {

	private Scoring scoring;
	
	public Administration(Scoring scoring) {
		this.scoring = scoring;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("[" + Thread.currentThread().getName() + "] " + scoring.getHighScores());
		}
	}

}
