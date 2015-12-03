package com.ryan.concurrency.readwrite.locking.example;

public class Main {
	public static void main(String[] args) {
		Scoring scoring = new Scoring();
		Thread game = new Thread(new Game(scoring));
		Thread admin = new Thread(new Administration(scoring));
		Thread admin2 = new Thread(new Administration(scoring));
		Thread admin3 = new Thread(new Administration(scoring));
		
		game.start();
		admin.start();
		admin2.start();
		admin3.start();
		
	}
}
