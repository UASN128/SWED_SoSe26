package com.ex04.System;

import com.ex04.Subscription.ID;

public class User {
	final public ID ID;
	final String name;
	
	public User(ID id, String name) {
		this.ID = id;
		this.name = name;
	}
	
	public User(String name) {
		int idNumber = 0;
		this.ID = new ID(idNumber);
		this.name = name;
	}

	public ID getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
	
	
}
