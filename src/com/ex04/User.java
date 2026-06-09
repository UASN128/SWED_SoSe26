package com.ex04;

public class User {
	final ID ID;
	final String name;
	
	public User(ID id, String name) {
		this.ID = id;
		this.name = name;
	}

	public ID getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
	
	
}
