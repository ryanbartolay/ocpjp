package com.ryan.enthuware.javaclassdesigna;

class AA implements Cloneable { 
	public int i = 10;
	
	void method() throws CloneNotSupportedException {
		this.clone();
	}
}  

class BB extends AA {
	public int i = 20;	
}   

public class Number14 {
	public static void main(String args[]) throws Exception {
		BB b1 = new BB();
		BB b2 = null;

		//B b2 = (B)b1.clone(); // clone is a protected method
		System.out.println(b1==b2);
		System.out.println(new java.util.Date().getTime());
	} 
}