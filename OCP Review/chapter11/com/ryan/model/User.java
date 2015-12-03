package com.ryan.model;

public class User implements Comparable<User> {
	private long id;
	private String name;

	public User() {
		super();
	}
	public User(long id) {
		super();
		this.id = id;
	}

	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return (int) (this.id * 174);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User user = (User) obj;
			if(this.id == user.getId()) {
				return true;
			}
		}
		
		return false; 
	}
	@Override
	public int compareTo(User x) {
		//return this.name.compareTo(x.name);
		if(this.getId() > x.getId()) {
			return 1;
		} else if(this.getId() == x.getId()) {
			return 0;
		} else {
			return -1;
		}
	}
}
