package com.ryan.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChoosingBundlesExample {
	public static void main(String[] args) {
		Locale locale = new Locale("fr", "CA");
		ResourceBundle bundle = ResourceBundle.getBundle("RB", locale);
		
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getObject("content.menu"));
		System.out.println(bundle.getObject("content.main_menu"));
				
		
	}
}
