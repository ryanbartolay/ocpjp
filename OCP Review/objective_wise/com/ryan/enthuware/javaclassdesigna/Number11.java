package com.ryan.enthuware.javaclassdesigna;

class B {} 
class B1 extends B {} 
class B2 extends B {} 

public class Number11 {
	public static void main(String args[]){
		B b = new B();
		B1 b1 = new B1(); 
		B2 b2 = new B2();// insert statement here
		
		//b = b1; will compile and valid
		// b2 = b; // fails at Compile time as an object referenced by b may not be a B2, so an explicit cast will be needed.
		b1 = (B1) b; // will throw runtimeexception because of the down casting
		// b2 = (B2) b1; // will not compile because b1 can never point to an object of class B2.
		// b1 = (B) b1; // This won't compile. Another cast is needed. i.e. b1 = (B1) (B) b1;
	}
}

