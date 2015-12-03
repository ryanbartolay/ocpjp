package com.ryan.exceptions;

class ExceptionA extends Exception {}
class ExceptionB extends Exception {}

public class WithoutDuplicationExample {
	void m1() throws ExceptionA, ExceptionB {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	void m2(boolean isSuccess) throws ExceptionA, ExceptionB {
		try {
			if(isSuccess) 
				throw new ExceptionB();
			else 			
				throw new ExceptionA();
		} catch(ExceptionA | ExceptionB e) {
			throw e;
		}
	}
}
