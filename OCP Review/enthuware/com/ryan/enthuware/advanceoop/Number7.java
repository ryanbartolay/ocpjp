package com.ryan.enthuware.advanceoop;

public class Number7 { 
	public static void main(String args[] ) {
		Outer out = new Outer();
		System.out.println(out.getInner().getOi());
	}
}

class Outer {
	private int oi = 20;
	class Inner {
		int getOi() { 
			return oi; 
		}
	}
	
	Inner getInner() { 
		return new Inner() ;
	} 
}