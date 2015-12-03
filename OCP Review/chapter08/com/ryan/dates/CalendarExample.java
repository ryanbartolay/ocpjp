package com.ryan.dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // to instantiate calendar, because it is abstract
		
		Date date = new Date(1_000_000_000_000l); // time in milliseconds
		
		calendar.setTime(date);
		System.out.println(calendar.getTime());
		
		if(Calendar.SUNDAY == calendar.getFirstDayOfWeek()) {
			System.out.println("Sunday is first day of the week");
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		}
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println(calendar.toString());
		Date d = calendar.getTime();
		System.out.println(d);
	}
}
