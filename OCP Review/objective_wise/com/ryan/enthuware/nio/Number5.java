package com.ryan.enthuware.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number5 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\a\\b\\c.java");  
		// What will p1.getName(2).toString() return?
		System.out.println(p1.getRoot());
		System.out.println(p1.getName(0).toString());
		System.out.println(p1.getName(1).toString());		
		System.out.println(p1.getName(2).toString());
		System.out.println(p1.getName(3).toString());
	}
}
