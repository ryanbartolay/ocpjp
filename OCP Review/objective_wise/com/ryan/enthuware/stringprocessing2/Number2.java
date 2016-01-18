package com.ryan.enthuware.stringprocessing2;

import java.util.StringTokenizer;

public class Number2 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a aa aaa", "x", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
