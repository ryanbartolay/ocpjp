package com.ryan.standard.test7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Number46 {
	static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

	public static String getData() {
		String data = p1.getName(0).toString();
		return data;
	}

	public static void main(String[] args) {
		System.out.println(getData());
	}
}
