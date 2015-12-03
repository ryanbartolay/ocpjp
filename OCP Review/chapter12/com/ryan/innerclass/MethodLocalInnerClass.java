package com.ryan.innerclass;

public class MethodLocalInnerClass {
	private String x = "2";
	private static String y = "1234567890";
	
	public static void main(String[] args) {
		MethodLocalInnerClass icfm = new MethodLocalInnerClass();
		icfm.doStuff2();
		
		MethodLocalInnerClass.doStuff3();
	}
	
	// class declaration inside a method
	void doStuff() {		
		class MyInnerClass {
			public void seeOuter() {
				System.out.println("Outer private x is " + x);
				//InnerClassFromMethod.this.doStuff();
			}
		}
		
		MyInnerClass myc = new MyInnerClass();
		myc.seeOuter();
	}
	
	void doStuff2() {
		final long y = (long) 422311.23_45;		
		
		class MyInnerClass {
			public void seeOuter() {
				System.out.println("Outer private x is " + x);
				System.out.println("Method variable is " + Long.valueOf(y)); // will no compile if y is not final
			}
		}
		
		MyInnerClass myc = new MyInnerClass();
		myc.seeOuter();
	}
	
	static void doStuff3() {
		class MyInnerClass {
			public void seeOuter() {
				System.out.println("Outer private x is " + y);	// need			
			}
		}
		
		MyInnerClass myc = new MyInnerClass();
		myc.seeOuter();
	}
}
