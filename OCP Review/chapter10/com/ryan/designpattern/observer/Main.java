package com.ryan.designpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.addChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				System.out.println("Prop name : " + evt.getPropertyName() 
						+ " old : " + evt.getOldValue() 
						+ " new : " + evt.getNewValue());
			}
		});
		
		user.setFirstname("Ryan");
	}

}
