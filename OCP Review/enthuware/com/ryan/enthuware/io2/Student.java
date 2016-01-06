package com.ryan.enthuware.io2;

import java.io.Serializable;

public class Student implements Serializable {

/*	private static final long serialVersionUID = 1;
	
	public String name;
	public String grade;
	public String toString() { 
		return "["+name+", " + grade + "]"; 
	}*/
	
	public static final long serialVersionUID = 1; 
	public String id="S111"; 
	public String name; 
	public String grade; 
	public int age=15; 
	public String toString() { 
		return "["+id+", "+name+", "+grade+", "+age+"]"; 
	}
}
