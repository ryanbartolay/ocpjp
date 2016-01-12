package com.ryan.enthuware.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number6 {
	public static void main(String[] args) {
		String input = "CooLooLCuuLooC";
		//String regex = "(\\s|\\b)0[xX][0-9a-f_A-F]+(\\s|\\b)";
		String regex = "C.*L";
		
		/**
		 * . - dot means any character
		 * 
		 * ? - non-greedy 0 or 1 
		 * * - greedy 0 or more
		 */
		
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(input);
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}
