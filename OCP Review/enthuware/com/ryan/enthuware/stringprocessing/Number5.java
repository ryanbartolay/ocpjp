package com.ryan.enthuware.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number5 {
	public static void main(String[] args) {
		String input = "0x987 0x9 0X11 0xa";
		//String regex = "(\\s|\\b)0[xX][0-9a-f_A-F]+(\\s|\\b)";
		String regex = "(\\s|\\b)0[xX][0-9a-fA-F]+(\\s|$)";
		
		/**
		 * \s - space
		 * \b - boundary
		 * \w - word
		 * (\s|\b) - space or boundary, this will not eat up the space or boundary
		 * 0-9 - range
		 * 
		 * ? - non-greedy 0 or 1 
		 * * - greedy 0 or more
		 * 
		 * ^ - beginning of the input
		 * $ - end of the input
		 */
		
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(input);
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}
