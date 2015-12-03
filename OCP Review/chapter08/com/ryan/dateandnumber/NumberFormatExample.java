package com.ryan.dateandnumber;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class NumberFormatExample {
	private static double fl = 123.45678910;	
	private static List<NumberFormat> formats = new LinkedList<NumberFormat>();

	public static void main(String[] args) {

		Locale loc = new Locale("fr"); // France

		formats.add(NumberFormat.getInstance());
		formats.add(NumberFormat.getInstance(loc));
		formats.add(NumberFormat.getCurrencyInstance());
		formats.add(NumberFormat.getCurrencyInstance(loc));

		for(NumberFormat format : formats) {
			System.out.println(format.format(fl));
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		// Setting decimal points
		NumberFormat nf = NumberFormat.getInstance();
		System.out.print(nf.getMaximumFractionDigits() + " ");
		System.out.print(nf.format(fl) + " ");
		nf.setMaximumFractionDigits(6);
		System.out.println(nf.format(fl));
		
		
		try {
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(""+fl));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
