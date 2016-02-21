package com.ryan.standard.test4;

class OuterWorld { 
	private InnerPeace i = new InnerPeace(); 
	
	private class InnerPeace {
		private String reason = "none";
	}
	
	public void print() {
		System.out.println(i.reason); // Outerworld can access the private property of inner class (InnerPeace)
	}
}

public class Number34 {
	public static void main(String[] args) {
		new OuterWorld().print(); 
	}
}
