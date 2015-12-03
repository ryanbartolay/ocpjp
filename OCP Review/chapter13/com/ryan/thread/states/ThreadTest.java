package com.ryan.thread.states ;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ThreadTest implements Runnable {

	public static boolean run = true;
	private Calendar cal = new GregorianCalendar();
	
	@Override
	public void run() {
		while(run) {
			
			System.out.println((new Date()) + " : " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
		
			try {
				Thread.sleep(5 * 60 * 10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Resuming....");
		}
	}
}
