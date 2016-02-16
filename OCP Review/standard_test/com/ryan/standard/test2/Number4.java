package com.ryan.standard.test2;

import java.io.Console;

public class Number4 {
	public static void main(String[] args) {
		Console c = System.console(); //1
		String line = c.readLine("Please enter your name:"); //2
		System.out.println("Hello, "+line); //3
		
		// line 2 will throw NullPointerException, 
		// since the code is run in the background, no console is available to it.
		
		// should do the checking first
		if(c != null) {}
	}
}
