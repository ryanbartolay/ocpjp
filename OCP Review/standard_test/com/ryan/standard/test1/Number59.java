package com.ryan.standard.test1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Number59 {
	public static void main(String[] args) {
		Date date = new GregorianCalendar().getTime();
				
		System.out.println(new SimpleDateFormat("zzzz", Locale.US).format(date));
		
		System.out.println(new SimpleDateFormat("XXX", Locale.US).format(date));
		System.out.println(new SimpleDateFormat("z", Locale.US).format(date));
		System.out.println(new SimpleDateFormat("T", Locale.US).format(date));
	}
}
