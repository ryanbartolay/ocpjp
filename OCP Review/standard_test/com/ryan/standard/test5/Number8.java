package com.ryan.standard.test5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number8 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[wow]*"); 
		Matcher m = p.matcher("wow its cool"); 
		boolean b = false;
		
		while(b = m.find()) {
			System.out.println(m.start()+" \""+m.group()+"\" ");
		}
	}
}
