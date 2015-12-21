package com.ryan.ioandnio.console;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		String name = "";
		Console console = System.console();
		
		char[] pw = null;
		pw = console.readPassword("%s", "pw : ");

		for(char ch : pw) {
			console.format("%c", ch);
		}
		console.format("\n");
		
		/*MyUtility mu = new ConsoleExample().new MyUtility();
		while(true) {
			name = console.readLine("%s", "input : ");
			console.format("output %s \n", mu.doStuff(name));
		}*/
	}
	
/*	class MyUtility {
		String doStuff(String name) {
			return "result is " + name;
		}
	}*/
}
