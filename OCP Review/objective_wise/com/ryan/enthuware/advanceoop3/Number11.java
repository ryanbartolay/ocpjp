package com.ryan.enthuware.advanceoop3;

public class Number11 { 
	public Inner inner1 = new Inner() { 
		public void doA(){
			System.out.println("doing A"); 
		} 
	};  
	public void doA() { 
		//inner1.doA(); // even though the anonymous subclass of Inner has doA() method, Inner does not and the type of inner1 is Inner.
		// Therefore, compiler will complain that Inner does not have doA().
	} 
}  

class Inner { int value; } // must have doA() method here to be able access doA in line 9 
// as the reference type on line 4 is Inner class 
