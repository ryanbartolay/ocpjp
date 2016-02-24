package com.ryan.standard.test5;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Number16 {	
	public static void main(String[] args) {
		double amount = 123456.789;
		Locale fr = new Locale("fr", "FR"); 
		NumberFormat formatter = NumberFormat.getInstance(fr); 
		String s = formatter.format(amount) ; 
		formatter = NumberFormat.getInstance(); 
		// Number amount2 = formatter.parse(s); // will not compile need to throw checked Exception 
		//System.out.println( amount + " " + amount2 );
	}
}
