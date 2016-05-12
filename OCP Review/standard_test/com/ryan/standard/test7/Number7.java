package com.ryan.standard.test7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Number7 {
	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.CANADA);
		// df.setLocale(Locale.CANADA); // there is no such method
		// Locales are set upon getting of instance.
	}
}
