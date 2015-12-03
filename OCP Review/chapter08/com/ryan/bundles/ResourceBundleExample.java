package com.ryan.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
	public static void main(String[] args) {
		Locale locale = new Locale("en");
		System.out.println(locale.getDisplayLanguage() + 
				"-" + locale.getDisplayCountry());
		
		Locale localeCanada = new Locale("fr", "CA");
		System.out.println(localeCanada.getDisplayLanguage() + 
				"-" + localeCanada.getDisplayCountry());
		
		// default locale - en
		ResourceBundle bundle = ResourceBundle.getBundle("Labels");
		
		System.out.println(bundle.getObject("content.menu"));
		
		System.out.println(bundle.getString("hello"));
		
		
		ResourceBundle bundle2 = ResourceBundle.getBundle("Labels", localeCanada);
		
		System.out.println(bundle2.getObject("content.menu"));
		
		System.out.println(bundle2.getString("hello"));
	}
}
