package com.ryan.enthuware.javaclassdesigna;

import java.io.IOException;
import java.sql.SQLException;

interface I1{   void m1() throws IOException;}
interface I2{   void m1() throws SQLException;}

public class Number13 implements I1, I2
{
	public static void main(String args[])  {
		Number13 tc = new Number13();
		I1 i1 = (I1) tc; //This is valid.
		try {
			i1.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}

		I2 i2 = (I2) tc; //This is valid too.
		try {
			i2.m1();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void m1() {
		System.out.println("Hi there");
	}
}