package com.ryan.standard.test7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number28 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\temp\\hello\\");
		Path p2 = Paths.get("\\..\\report.pdf");
		System.out.println(p1.resolve(p2));
	}
}
