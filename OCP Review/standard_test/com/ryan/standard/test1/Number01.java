package com.ryan.standard.test1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Number01 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("c:\\temp\\test1.txt");
		Path p2 = Paths.get("c:\\temp\\test2.txt");
		
		// Files.move(p1, p2); // This will throw a java.nio.file.FileAlreadyExistsException if the file already exists.
		
		Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING); 
		Files.delete(p1);
	}
}
