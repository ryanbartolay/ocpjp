package com.ryan.standard.test2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number21 {
	public static void main(String[] args) {
		 Path p1 = Paths.get("c:\\..\\temp\\test.txt");
		 System.out.println(p1.normalize().toUri()); // file:///c:/temp/test.txt
	}
}
