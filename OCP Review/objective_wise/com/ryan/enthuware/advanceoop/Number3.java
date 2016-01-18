package com.ryan.enthuware.advanceoop;

public class Number3 {
	private static final int taxId = 300000;
	
	private String name;
	public String searchBook( final String criteria ) { // can be accessed because it is declared as final
		int count = 0; // only final local variables of the method are accessible to the inner class defined in that method so option 4 is not correct.
		
		class Enumerator { 
			String interate( int k) {
				// System.out.println(count); // unaccessible
				System.out.println(criteria);
				return "";
			}
		}
		return "";		
	}
}
