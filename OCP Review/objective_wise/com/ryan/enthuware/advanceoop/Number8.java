package com.ryan.enthuware.advanceoop;

//public enum EnumA{ A, AA, AAA}; //1 Since both EnumA and Number8 are public, they must be defined in a file with a name of EnumA.java and TestClass.java respectively. 

public class Number8 //2 
{
	public enum EnumB{ B, BB, BBB }; //3    
	public static enum EnumC{ C, CC, CCC }; //4    
	public Number8() {
//		enum EnumD{ D, DD, DDD } //5 An enum cannot be defined inside any method or constructor.
	}
	
	public void methodX() {
//		public enum EnumE{ E, EE, EEE } //6  An enum cannot be defined inside any method or constructor.  
	}
	
	public static void main(String[] args) //7    
	{
//		enum EnumF{ F, FF, FFF}; //8 An enum cannot be defined inside any method or constructor.
	}
}
