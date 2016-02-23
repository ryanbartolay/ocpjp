package com.ryan.standard.test4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Number62 {
	public static void copy1(Path p1, Path p2) throws Exception {
		Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void main(String[] args) throws Exception {
		Path p1 = Paths.get("c:\\temp\\test1.txt"); 
		Path p2 = Paths.get("c:\\temp\\test2.txt"); 
		copy1(p1, p2); 
		
		if(Files.isSameFile(p1, p2)){ 
			System.out.println("file copied"); 
		}else{ 
			System.out.println("unable to copy file");
		}
	}
}
