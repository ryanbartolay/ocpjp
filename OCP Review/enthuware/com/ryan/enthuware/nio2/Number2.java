package com.ryan.enthuware.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class Number2 {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Temp\\test.txt");
		DosFileAttributeView fileAttributeView = Files.getFileAttributeView(p, DosFileAttributeView.class);
		
		fileAttributeView.setArchive(true);
		fileAttributeView.setHidden(true);
		fileAttributeView.setReadOnly(true);
		fileAttributeView.setSystem(true);
		
		DosFileAttributes attrs = fileAttributeView.readAttributes();
		System.out.println(attrs.isArchive());
		System.out.println(attrs.isHidden());
		System.out.println(attrs.isReadOnly());
		System.out.println(attrs.isRegularFile());
		System.out.println(attrs.isDirectory());
		
	}
}
