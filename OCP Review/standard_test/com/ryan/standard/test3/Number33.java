package com.ryan.standard.test3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number33 {
	static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

	public static String getRoot(){
		String root = p1.getRoot().toString();
		return root;
	}
	
	public static void main(String[] args) {
		System.out.println(getRoot()); // c:\ - always has \ at end
		System.out.println(p1.getName(0));
		System.out.println(p1.getName(1));
		System.out.println(p1.getName(2));
		System.out.println(p1.getName(3)); // will cause java.lang.IllegalArgumentException
	}
}

