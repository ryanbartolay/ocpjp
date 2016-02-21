package com.ryan.standard.test4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Number32 {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		//DateFormat df = new DateFormat(DateFormat.LONG);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("zzzz");     
		System.out.println(sdf.format(new Date()));
	}
}
