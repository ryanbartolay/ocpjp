package com.ryan.enthuware.advanceoop2;

public class Number12 {
	static {
		System.out.println("In static");
	}
	{
		System.out.println("In non - static");
	}
	
	public static void main(String args[ ]) {
		Number12 st1; 					//1        
		System.out.println(" 1 ");
		st1 = new Number12(); 			//2 
		System.out.println(" 2 ");
		Number12 st2 = new Number12(); 	//3
	} 
}