package com.ryan.nio;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("directory", "file", "2015");
		Path p2 = Paths.get("C:", "ConsoleExample.java");
		
		System.out.println(p2.getFileName());
		System.out.println(Files.isDirectory(p1));
		
		// this will throw exception if not put in URI
		// URI - Uniform Resource Identifier
		Path p3 = Paths.get(URI.create("file:///c:/ConsoleExample.java"));
		System.out.println(Files.isDirectory(p3));
		
		// getting Full Path
		Path p4 = FileSystems.getDefault().getPath("C:", "aix_db");
		System.out.println(Files.getOwner(p4));
		
		// Path <---> File conversion
		File f = p4.toFile();
		Path p = f.toPath();
		
		int spaces = 1;
		for(Path pi : p1) {
			System.out.format("%" + spaces + "s-%n", pi);
			spaces += 2;
		}
	}
}
