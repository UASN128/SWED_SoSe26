package com.ex04;

import java.util.ArrayList;

public class SubscriptionSystem {
	private ArrayList<User> userList;
	
	SubscriptionSystem(){
		userList = new ArrayList<>();		
	}
	
	public void addUser() {
		userList.add(new User());
	}
	public void addUser(String name) {
		userList.add(new User(name));
	}
	
	public void generateNotification() {
		System.out.println("One of your sites has an update!");
	}
	
	public void periodicalCheck() {
		for(User usr : userList) {
			SubscriptionList subList = usr.getSubs();
			ArrayList<Subscription> subs = subList.getSubs();
			for(Subscription sub : subs) {
				if(sub.checkChange()) generateNotification();				
			}
		}
	}

}
