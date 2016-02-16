package com.ryan.enthuware.nio3;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

public class Number5 {
	public static void main(String[] args) {
		File[] roots = File.listRoots(); 
		for(File f : roots){
			System.out.println(f); 
		}
		
		List<Path> root = (List<Path>) FileSystems.getDefault().getRootDirectories(); 
		for(Path path : root){
			System.out.println(path); 
		}
	}
}
