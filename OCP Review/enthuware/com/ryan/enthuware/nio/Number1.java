package com.ryan.enthuware.nio;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Number1 {
	public static void main(String[] args) throws URISyntaxException {
		Path p1 = Paths.get("c:\\temp\\test.txt");
		Path p2 = Paths.get("report.pdf"); 
		
		/**
		 * If the argument is a relative path (i.e. if it doesn't start with a root), 
		 * the argument is simply appended to the path to produce the result.
		 */
		System.out.println(p1.resolve(p2)); // c:\temp\test.txt\report.pdf
		
		p2 = Paths.get("\\report.pdf");
		System.out.println(p1.resolve(p2)); // c:\report.pdf
	}
}
