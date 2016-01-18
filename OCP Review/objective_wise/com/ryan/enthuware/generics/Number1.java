package com.ryan.enthuware.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Number1 {
	public static void main(String[] args) {
		List<? extends Shape> shapes = new ArrayList<>();
		
		//m1(new ArrayList<Triangle>()); // not alloweds
		Triangle[] tris = new Triangle[] {
			
		};
		m2(tris);
		
		m3(new ArrayList<Shape>());
		m3(new ArrayList<Triangle>());
		
		m4(new LinkedList<Triangle>()); 
		m4(new LinkedList<Shape>());
		
		System.out.println(m5());
	}
	
	public void m1(List<Shape> shapes) {
		
	}
	
	public static void m2(Shape[] shapes) {
		
	}
	
	public static void m3(ArrayList<? super Triangle> strList) {
		List<? extends Shape> list = new ArrayList<>(); 
		
	}
	
	public static List<? extends Shape> m4 (List<? extends Shape> strList) { // you cannot add
		List<Shape> list = new ArrayList<>();
		list.add(new Shape());
		list.addAll(strList);
		return list;
	}
	
	public static Map<? super Shape, ? super Rectangle> m5() {
		Map<? super Shape, Shape> m = new HashMap<>();
		m.put(new Shape(), new Rhombus());
		return m;
	}
}

class Shape {
	
}

class Triangle extends Shape {
	
}
class Rectangle extends Shape {
	
}
class Rhombus extends Rectangle {
	
}