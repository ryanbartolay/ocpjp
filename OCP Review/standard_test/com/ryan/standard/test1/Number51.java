package com.ryan.standard.test1;

public class Number51 {
	public static void main(String[] args) {
		String str = null;
		/**
		 * The String in the switch expression is compared with the expressions associated 
		 * with each case label as if the String.equals method were being used. 
		 * This means if the string in the switch expression turns out to be null, 
		 * it will cause a NullPointerException to be thrown.
		 */
		switch(str){ 
		case "null" : System.out.println("1");
		break;
		case "" : System.out.println("2"); 
		break;
		default : System.out.println("3");
		}
	}
}
