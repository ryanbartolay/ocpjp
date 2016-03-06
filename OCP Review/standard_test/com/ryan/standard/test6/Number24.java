package com.ryan.standard.test6;


// boxing and unboxing refer to the most specific type of the variable
// Last would be the var~args type
public class Number24 {
	void probe(Object o) { System.out.println("In Object"); }
	void probe(int... x) { System.out.println("In ..."); }//1          
	//void probe(Integer x) { System.out.println("In Integer"); } //2          
	void probe(long x) { System.out.println("In long"); }//3          
	void probe(Long x) { System.out.println("In LONG"); } //4  
	
	public static void main(String[] args){
		Integer a = 4; new Number24().probe(a); //5 
		int b = 4; new Number24().probe(b); //6  
		
		String c = "4";
		
		new Number24().probe(c);
	}
}
