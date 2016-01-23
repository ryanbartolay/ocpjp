package com.ryan.enthuware.nio3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number10 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
		Path p2 = Paths.get("c:\\personal\\index.html");
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
	}
	public static synchronized void doIT() {
		
	}
}
