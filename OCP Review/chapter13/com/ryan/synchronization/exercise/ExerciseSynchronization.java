package com.ryan.synchronization.exercise;

public class ExerciseSynchronization extends Thread {
	private StringBuffer sb = null; // string buffer is the same as string builder but its synchronized and thread safe
	private char charToAppend = 'a';	
	public ExerciseSynchronization(StringBuffer sb) {		
		this.sb = sb;
	}


	@Override
	public void run() {
			
		synchronized (this) {
			for(int i = 1; i <= 100; i++) {
				sb.append(charToAppend);
			}
			System.out.println(sb.toString());
			charToAppend++;
		}
		
	}
}
