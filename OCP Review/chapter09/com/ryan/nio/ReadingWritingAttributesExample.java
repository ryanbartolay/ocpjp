package com.ryan.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ReadingWritingAttributesExample {
	public static void main(String[] args) throws IOException {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.YEAR, -2);
		Date dateCreated = cal.getTime();
		
		System.out.println(dateCreated);
		
		Path dir = Paths.get("directory", "nio");		
		Files.createDirectories(dir);
		Path file = Paths.get("directory", "nio", "file.txt");
		if(!Files.exists(file)) {
			Files.createFile(file);
		}
		
		FileTime time = FileTime.fromMillis(dateCreated.getTime());		
		Files.setLastModifiedTime(dir.relativize(file), time);
		System.out.println(Files.getLastModifiedTime(dir.relativize(file)));
	}
}
