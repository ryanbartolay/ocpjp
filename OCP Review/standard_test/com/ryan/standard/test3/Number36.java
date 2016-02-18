package com.ryan.standard.test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number36 {
	public static void main(String[] args) {
		String str = "CooLooLCuuLooC";
		Pattern p = Pattern.compile("C*");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}
