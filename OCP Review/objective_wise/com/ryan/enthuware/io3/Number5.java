package com.ryan.enthuware.io3;

import java.io.Console;

public class Number5 {
	public static void main(String[] args) {
		Console c= System.console();
		char[] cha = c.readPassword("Enter Password");
		String pwd = new String(cha);
		System.out.println("pwd = " + pwd);
	}
}
