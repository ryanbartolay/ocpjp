package com.ryan.standard.test7;

import java.util.Arrays;
import java.util.Collections;

public class Number42 {
	public static void main(String[] args) {
		Object[] sa = { 100, 100.0, "100" };
		Collections.sort(Arrays.asList(sa), null);
		System.out.println(sa[0] + " " + sa[1] + " " + sa[2]);
	}
}
