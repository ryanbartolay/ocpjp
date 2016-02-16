package com.ryan.standard.test2;

public class Number25 {
	
	public class Number25A { } 
	public static class Number25B  { }
	
	public void instantiate() {
		new Number25A();
		new Number25().new Number25A();
		new Number25.Number25B();
		new Number25.Number25A();
	}
	
	public static void main(String[] args) {
		
	}
}
