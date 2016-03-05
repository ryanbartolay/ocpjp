package com.ryan.standard.test5;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Number18 {
	public static void main(String[] args) {
		Date d = Calendar.getInstance(Locale.FRANCE).getTime();
		DateFormat mdf = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		// Locale is always last parameter in an argument
	}
}
