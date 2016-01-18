package com.ryan.enthuware.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number4 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\temp\\test.txt"); 
		Path p2 = Paths.get("c:\\temp\\report.pdf");
		System.out.println(p1.resolve(p2)); // c:\temp\report.pdf
		System.out.println(p2.resolve(p1)); // c:\temp\test.txt
		
		System.out.println(p1.relativize(p2)); // ..\temp\report.pdf

	}
}
