package com.ryan.innerclass;

public class InstantiateInnerFromOuter {
	
	public static void main(String[] args) {
		new InstantiateInnerFromOuter().seeInner();
	}
	
	public void seeInner() {
		MyInner m = new MyInner();
		m.sayHello();
	}
	
	class MyInner {
		void sayHello() {
			System.out.println("Hello");
		}
	}
}
