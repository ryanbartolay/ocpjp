package com.ryan.enthuware.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileChecker extends SimpleFileVisitor<Path> {
	private final PathMatcher matcher;
	private static int count;

	public MyFileChecker() {
		matcher = FileSystems.getDefault().getPathMatcher("glob:*.java");
	}

	void check(Path p){ 
		Path name = p.getFileName();
		if(name != null && matcher.matches(name)){ 
			count++;
		}
	}

	public int getCount(){ 
		return count;
	}

	public FileVisitResult visitFile(Path p, BasicFileAttributes attr){
		check(p);
		return FileVisitResult.CONTINUE;
	}
}

public class Number7 {
	public static void main(String[] args) throws IOException {
		MyFileChecker mfc = new MyFileChecker();
		
		/**
		 * Note that Files.walkFileTree method will cause each subdirectory under the given directory to be travelled. 
		 * For each file in each directory, the FileVisitor's visitFile will be invoked. This particular visitor 
		 * simply tries to match the full file name with the given glob pattern. 
		 * 
		 * The glob pattern will match only the files ending with .java.
		 */
		Files.walkFileTree(Paths.get("c:\\works\\pathtest\\dir1"), mfc);
		System.out.println(mfc.getCount());
	}
}
