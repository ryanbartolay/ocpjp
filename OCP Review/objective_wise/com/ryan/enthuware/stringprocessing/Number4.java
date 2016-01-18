package com.ryan.enthuware.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number4 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s[\\d]*\\s"); // looking for [space][any numeric value][space]
		Matcher m = p.matcher("12 3abc ab23"); // no output 
		boolean b = false; 
		while(b = m.find()) {
			System.out.println(m.start()+" "+m.group());
		}
	}
}
