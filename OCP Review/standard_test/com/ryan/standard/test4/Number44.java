package com.ryan.standard.test4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Number44 {
	public static void main(String[] args) throws Exception { 
		double amount = 53000.35;
		Locale jp = new Locale("jp", "JP");
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(jp);
		
		NumberFormat f = DecimalFormat.getCurrencyInstance(jp);
		
		// NumberFormat ff = NumberFormat.getCurrencyFormatter(jp); // no such method error
		
		NumberFormat fff = NumberFormat.getInstance(jp); // this is ok but need currency, this will only format as #
		
		NumberFormat ffff = new DecimalFormat("#.00"); // Decimal format can be instantiated
		
		System.out.println(formatter.format(amount));
		
		System.out.println(f.format(amount));
		
		System.out.println(fff.format(amount));
		
		System.out.println(ffff.format(amount));
	}
}
