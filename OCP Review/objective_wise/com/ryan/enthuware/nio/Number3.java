package com.ryan.enthuware.nio;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * IllegalArgumentException - if preconditions on the uri parameter do not hold. The format of 
 * 		the URI is provider specific. 
 * FileSystemNotFoundException - The file system, identified by the URI, does not exist and cannot 
 * 		be created automatically, or the provider identified by the URI's scheme component is not installed 
 * SecurityException - if a security manager is installed and it denies an unspecified permission 
 * 		to access the file system
 * @author ryan.bartolay
 */
public class Number3 {
	public static void main(String[] args) throws URISyntaxException {
		Path p1 = Paths.get(new URI("file://e:/temp/records"));
		System.out.println(p1.getRoot());
	}
}
