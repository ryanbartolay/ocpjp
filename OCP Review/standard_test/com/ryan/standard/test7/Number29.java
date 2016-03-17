package com.ryan.standard.test7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number29 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\temp\\test.txt");
		Path p2 = Paths.get("report.pdf");
		System.out.println(p1.resolve(p2));
		System.out.println(p1.resolveSibling(p2));
		
		System.out.println(p1.relativize(p2));
	}
}
