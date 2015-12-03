package com.ryan.enthuware.advanceoop;

public class Number13 {
	private String data = "skin";
	
	private class Layer extends Number13 {
		String data = "thegoodpart";
		public String getData() {
			return data;
		}
	}
	
	public String getData() {
		return new Layer().getData();
	}
	
	public static void main(String[] args) {
		Number13 o = new Number13();
		System.out.println(o.getData());
	}
}
