package com.ryan.enthuware.nio;

import java.nio.file.FileVisitResult;

public class Number2 {
	public static void main(String[] args) {
		System.out.println(FileVisitResult.CONTINUE);
		System.out.println(FileVisitResult.SKIP_SIBLINGS); // Continue without visiting the siblings of this file or directory.
		System.out.println(FileVisitResult.SKIP_SUBTREE); // Continue without visiting the entries in this directory.
		System.out.println(FileVisitResult.TERMINATE); 
	}
}
