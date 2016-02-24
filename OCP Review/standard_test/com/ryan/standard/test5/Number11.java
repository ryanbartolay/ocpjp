package com.ryan.standard.test5;

import java.util.ArrayList;
import java.util.List;

public class Number11 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("A"); 
		//list.addAll(new ArrayList<>());// will not compile
		
		list.addAll(new ArrayList<String>());
		
		
		
		List<String> l = new ArrayList<>(); 
		l.add("A"); 
		List<? extends String> list2 = new ArrayList<>(); 
		l.addAll(list2);
		l.add("helo");
	}
}
