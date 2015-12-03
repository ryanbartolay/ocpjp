package com.ryan.formatting;

public class PrintFExample {
	public static void main(String[] args) {
		// composition
		// %[arg_index][flags][width][precision]conversion char
		System.out.printf("%d + %s %d", 123, "ryan", 456); // position as is
		System.out.println();
		System.out.printf("%2$d + %3$s %1$d", 123, 456, "ryan"); // gets position
		System.out.println();
		System.out.println("----------------- int ---------------------");
		int i1 = -12355;
		int i2 = 12345;
		float i3 = 123.45f;
		
		System.out.printf("%1$,(10d \n", i1); // if negative put in parentheses
		//  (12,355) 
		System.out.printf("%1$,(10d \n", i2); // format number with comma
		//    12,345 
		System.out.printf("%1$+-10d \n", i1); // +if positive - if negative iwth left justify
		//-12355     
		System.out.printf("%2$b + %1$010d \n", i2, false); // boolean, fill in with 0 10 digits
		//false + 0000012345
		System.out.printf("%1$+f", i3);
		//+123.449997
	}
}
