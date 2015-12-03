package com.ryan.innerclass;

public class InnerSelfReferencing {
	
	private String x = "Ryan";
	
	public static void main(String[] args) {
		InnerSelfReferencing.MyInner inner = new InnerSelfReferencing().new MyInner();
		inner.seeOuter();
		inner.setInnerString("Set from Out side outer");
		
		new InnerSelfReferencing().makeInner();
	}
	
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	public void outerMethod() {
		System.out.println("Outer Method");
	}
	
	class MyInner {
		private String innerString;
		void seeOuter() {
			System.out.println(x);
			System.out.println("Inner class this " + this);
			System.out.println("Outer class ref  " + InnerSelfReferencing.this);
			
			// this.outerMethod(); // unable to see outer method from inner class 
			InnerSelfReferencing.this.outerMethod(); // correct way
		}
		public String getInnerString() {
			return innerString;
		}
		public void setInnerString(String innerString) {
			this.innerString = innerString;
		}
	}
}
