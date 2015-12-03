package com.ryan.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemOutUtility {
	
	public static void showResult(String regex, String source) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(source);
		
		System.out.println("source :\t" + source);
		System.out.println("\t\t0123456789012345678901234567890123456789");
		System.out.println("\t\t          1         2         3");		
		System.out.println("expression : " + m.pattern());
		System.out.println("Matched positions ");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
		System.out.println("\n");
		System.out.println("-----------------------------------------------------------------------\n");
		
		
	}
	
	public static void showGroupResultWithEnd(String regex, String source) {
		showGroupResult(regex, source, true);
	}
	
	public static void showGroupResult(String regex, String source) {
		showGroupResult(regex, source, false);
	}
	public static void showGroupResult(String regex, String source, boolean isShowEnd) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(source);
		
		System.out.println("source :\t" + source);		
		System.out.println("\t\t0123456789012345678901234567890123456789");
		System.out.println("\t\t          1         2         3");		
		System.out.println("expression : " + m.pattern());
		System.out.println("Matched positions ");
		
		while(m.find()) {
			if(isShowEnd) {
				System.out.println(m.start() + "-" + m.end() + " " + m.group());
			} else {
				System.out.println(m.start() + " " + m.group());
			}
		}
		
		System.out.println("\n");
		System.out.println("-----------------------------------------------------------------------\n");
		
		
	}
}
