package com.ryan.standard.test5;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Number24 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault(); 
		Iterable<Path> roots = fs.getRootDirectories(); 
		for(Path p : roots){ 
			System.out.println(p); 
		}
	}
}
