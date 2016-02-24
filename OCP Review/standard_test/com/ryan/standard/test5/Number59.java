package com.ryan.standard.test5;

import java.io.Console;

public class Number59 {
	public static void main(String[] args) {
		Console c = System.console();
		String id = c.readLine("%s", "Enter UserId:"); //1   
		System.out.println("userid is " + id); //2   
		char[] pwd = c.readPassword("%s", "Enter Password :"); //3   
		System.out.println("password is " + pwd); //4
	}
}
