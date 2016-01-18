package com.ryan.enthuware.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * You need to understand how relativize works for the purpose of the exam. 
 * The basic idea of relativize is to determine a path, which, when applied to the original path 
 * will give you the path that was passed. For example, "a/c" relativize "a/b" is "../b" 
 * because "/a/c/../b" is "/a/b" Notice that  "c/.." cancel out.
 * 
 * @author ryan.bartolay
 */
public class Number3 {
	public static void main(String[] args) {
		Path p1 = Paths.get("\\photos\\goa"); // current location
		Path p2 = Paths.get("\\absolute\\file\\index.html"); // going here
		Path p3 = p1.relativize(p2); // ..\..\index.html
		System.out.println(p3);
	}
}
