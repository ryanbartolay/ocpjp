package com.ryan.standard.test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number48 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".?pdf"); //Notice that .? matches 0 or 1 character 
		Matcher m = p.matcher("pdf");
		System.out.println(m.matches()); //prints true.        
		m = p.matcher(".pdf");
		System.out.println(m.matches()); //prints true.
	}
}
