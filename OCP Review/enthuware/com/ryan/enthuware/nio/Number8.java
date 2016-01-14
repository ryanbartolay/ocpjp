package com.ryan.enthuware.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.LinkOption.*;

import java.io.IOException;

public class Number8 {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("c:\\temp\\test.txt"); 
		Files.setAttribute(p, "dos:hidden", false, NOFOLLOW_LINKS);
	}
}
