package com.ryan.standard.test7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number43 {
	static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt");

	public static void main(String[] args) {
		System.out.println(p1.subpath(0, 2)); // paths do not start or end with \.
	}
}
