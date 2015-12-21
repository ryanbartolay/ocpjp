package com.ryan.nio.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("directory", "nio", "file.txt");
		BasicFileAttributes basic = Files.readAttributes(path, 
				BasicFileAttributes.class);
		System.out.println(basic.creationTime());
		System.out.println(basic.lastModifiedTime());
		System.out.println(basic.isDirectory());
	}
}
