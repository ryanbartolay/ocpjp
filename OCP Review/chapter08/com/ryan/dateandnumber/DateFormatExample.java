package com.ryan.dateandnumber;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DateFormatExample {
	public static void main(String[] args) {
		Date date = new Date(1_000_000_000_000l); // time in milliseconds
		
		List<DateFormat> dfa = new LinkedList<DateFormat>();
		dfa.add(DateFormat.getInstance());
		dfa.add(DateFormat.getDateInstance());
		dfa.add(DateFormat.getDateInstance(DateFormat.SHORT));
		dfa.add(DateFormat.getDateInstance(DateFormat.MEDIUM));
		dfa.add(DateFormat.getDateInstance(DateFormat.LONG));
		dfa.add(DateFormat.getDateInstance(DateFormat.FULL));
		
		for(DateFormat df : dfa) {
			System.out.println(df.format(date));
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s = df.format(date);
		
		System.out.println(s);
		
		try {
			Date parsedDate = df.parse(s);
			System.out.println(parsedDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
