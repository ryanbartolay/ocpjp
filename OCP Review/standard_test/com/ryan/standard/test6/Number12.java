package com.ryan.standard.test6;

public class Number12 {
	
	private Number12.Inner ni = null;
	
	public void Number12() { // this is a method and is allowed non-conflicting method
		
	}
	
	public Number12() {
		
	}
	
	protected class Inner { // inner class can be declared as protected
		
	}
	
	private class InnerPrivate { // inner class can be declared as private
		
	}
}
