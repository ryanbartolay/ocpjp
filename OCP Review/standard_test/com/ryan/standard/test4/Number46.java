package com.ryan.standard.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number46 {
	public static void main(String[] args) {
		String[] p = {"1", "2", "3" };
		
		// List<Integer> list1 = new ArrayList<>(Arrays.asList(p)); will not compile String array cannot be added to Integer array
		List<?> list2 = new ArrayList<>(Arrays.asList(p));
	}
}
