package com.ryan.standard.test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number22 {
	// \s[\d]*\s   "12 3abc ab23"
	public static void main(String[] args) {		
		Pattern p = Pattern.compile("\\s[\\d]*\\s"); 
		Matcher m = p.matcher("12 3abc ab23"); 
		boolean b = false; 
		
		while(b = m.find()) { 
			System.out.println(m.start()+" "+m.group());
		}
	}
}
