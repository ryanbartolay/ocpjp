package com.ryan.dateandnumber;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class LocaleExample {
	private static Calendar cal = Calendar.getInstance();
	private static List<Locale> locales = new LinkedList<Locale>();
	
	public static void main(String[] args) {
		locales.add(new Locale("it", "IT")); // Italy
		locales.add(new Locale("pt"));
		locales.add(new Locale("pt", "BR")); // Britain
		locales.add(new Locale("hi", "IN")); // india
		locales.add(new Locale("ja"));		// Japan		
		locales.add(new Locale("da", "DK"));		// Denmark
		
		
		for(Locale locale : locales) {
			displayLocale(locale, DateFormat.FULL);
		}
	}
	
	private static void displayLocale(Locale loc, int dateStyle) {
		DateFormat df = DateFormat.getDateInstance(dateStyle, loc);
		System.out.println(loc.getDisplayCountry() + "\t\t" + loc.getDisplayLanguage() + "\t\t" + df.format(cal.getTime()));
	}
		
}

