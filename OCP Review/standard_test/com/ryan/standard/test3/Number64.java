package com.ryan.standard.test3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number64 {
	public static void main(String[] args) {
		Path p1 = Paths.get("x\\y"); 
		Path p2 = Paths.get("z");
		System.out.println(p1.resolve(p2));
		System.out.println(p1.relativize(p2));
	}
}
