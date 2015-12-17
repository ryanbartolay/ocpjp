package com.ryan.enthuware.oop;

/**
 * the question here is, is this good implementation of singleton
 * answer : NO
 *
 */
public class Number5 {
	private static Number5 theInstance = null; 
	private Number5(){ } 
	public static Number5 getInstance(){ 
		if(theInstance == null){ 
			synchronized(Number5.class){ 
				if(theInstance == null){ 
					theInstance = new Number5(); 
				} 
			} 
		} 
		return theInstance; 
	} 
}
