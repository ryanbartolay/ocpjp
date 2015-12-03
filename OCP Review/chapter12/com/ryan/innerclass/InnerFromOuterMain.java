package com.ryan.innerclass;

public class InnerFromOuterMain {
	
	public static void main(String[] args) {
		
		/**
		 * Two liners
		 */
		InnerFromOuterMain ifrom = new InnerFromOuterMain();
		InnerFromOuterMain.InnerClass ic = ifrom.new InnerClass();
		
		ic.sayHello();
		
		/**
		 * One Liner
		 */
		InnerFromOuterMain.InnerClass innerClass = new InnerFromOuterMain().new InnerClass();
		innerClass.sayHello();
		
		/**
		 * One Liner with no variable reference
		 */
		new InnerFromOuterMain().new InnerClass().sayHello();
		
	}
	
	class InnerClass {
		
		public String HELLO = "WORLD";
		void sayHello() {
			System.out.println("HELLO " + HELLO);
		}
	}
}
