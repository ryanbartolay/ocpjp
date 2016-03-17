package com.ryan.standard.test7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Number37 {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("M", Locale.FRANCE);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM", Locale.FRANCE);
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMM", Locale.FRANCE);
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMMM", Locale.US);
		
		Date date = new Date();
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
	}
}
