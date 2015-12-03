package com.ryan.designpattern.observer;

public class User extends ListenableModel {
	private String firstname;
	private String lastname;
	
	public User() {
		this.firstname = "Default Firstname";
		this.lastname = "Default Lastname";
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.notifyChange(FIRSTNAME, this.firstname, firstname);
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.notifyChange(LASTNAME, this.lastname, lastname);
		this.lastname = lastname;
	}
}
