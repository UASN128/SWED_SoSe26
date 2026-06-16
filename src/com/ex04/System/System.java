package com.ex04.System;
import com.ex04.Subscription.WebsiteSubscription;

import java.util.ArrayList;
import java.util.List;

public class System {
	List<WebsiteSubscription> subList;
	List<User> userList;
	
	public System() {
		this.subList = new ArrayList<WebsiteSubscription>();
		this.userList = new ArrayList<User>();
	}

	public List<User> getUserList() {
		return userList;
	}

	public List<WebsiteSubscription> getSubList() {
		return subList;
	}
	
	public void addUser(String name) {
		this.userList.add(new User(name));
	}
}
