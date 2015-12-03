package com.ryan.dates;

import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date d = new Date(1_000_000_000_000l); // time in milliseconds
		System.out.println(d.toString()); // Sun Sep 09 09:46:40 SGT 2001
		
		d.setTime(d.getTime() + 3_600_000);
		System.out.println(d.toString()); // Sun Sep 09 10:46:40 SGT 2001
		
		System.out.println(new Date().getTime()); // 1447840808482 time in milliseconds
		
		java.sql.Date dsql = new java.sql.Date(1_000_000_000_000l);
		System.out.println(dsql.toString()); // 2001-09-09
	}
}
