package com.ryan.standard.test3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Number61 extends Frame {
	String s="Message";

	public static void main(String args[]) {
		
		Number61 t = new Number61(); 
		Button b = new Button("press me"); 
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		// 		System.out.println("Message is " +s); // unable to access s from inner class
			}
		}
				);
		t.add(b);
	}
}
