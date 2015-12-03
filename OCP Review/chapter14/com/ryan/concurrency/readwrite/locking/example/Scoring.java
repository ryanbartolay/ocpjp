package com.ryan.concurrency.readwrite.locking.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Scoring {
	private List<Integer> highScores = new LinkedList<>();
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private Lock readLock = lock.readLock();
	private Lock writeLock = lock.writeLock();
	private Condition condition = writeLock.newCondition();
	
	public void addScore(int score) {
		writeLock.lock();
		
		try {
			highScores.add(new Integer(score));
			Collections.sort(highScores, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 != o2 ? o1 > o2 ? -1 : 1 : 0;
				}
			});
			condition.signalAll();
		} finally {
			writeLock.unlock();
		}
	}
	
	public List<Integer> getHighScores() {
		
		try {
			writeLock.lock();
			condition.await();			
			readLock.lock();
			return this.highScores;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		} finally {
			writeLock.unlock();
			readLock.unlock();
		}
	}
}
