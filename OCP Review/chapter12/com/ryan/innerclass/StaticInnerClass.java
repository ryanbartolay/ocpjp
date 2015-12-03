package com.ryan.innerclass;

public class StaticInnerClass {
	static String name = "rayn";
	static class InnerClass {
		String go() {
			return "Ryan";
		}
	}
	
	
	public static void main(String[] args) {
		// instatntiating static inner class
		System.out.println(new StaticInnerClass.InnerClass().go());
		
		StaticInnerClass.InnerClass inner = new StaticInnerClass.InnerClass();
		
		System.out.println(StaticInnerClass.name);
	}
}
