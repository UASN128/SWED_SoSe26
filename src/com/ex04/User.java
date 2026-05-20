package com.ex04;

import java.util.Random;
// import java.lang.String;

public class User {
	private int userID;
	private String userName;
	private SubscriptionList subList;
	
	User(){
		this.userName = "Anon";
	}
	User(String Name){
		this.userName = Name;
	}
	
	public void register() {
		Random r = new Random();
		this.userID = r.nextInt(100000);
		this.subList = new SubscriptionList();		
	}
	
	public void subscribe(String name, String url, int noteFreq, String comChannel) {
		this.subList.addSubscription(name, url, noteFreq, comChannel);	
	}
	
	public void unsubscribe(String name) {
		this.subList.delSubscription(name);
	}

	public void changeSubscription(String name, Subscription.Atribute atr, String str) {
		subList.modSubcription(name, atr, str);
	}
	
	public void changeSubscription(String name, Subscription.Atribute atr, int i) {
		subList.modSubcription(name, atr, i);
	}
	
	public String getName() {
		return this.userName;
	}
	
	public int getID() {
		return this.userID;
	}
	
	public SubscriptionList getSubs() {
		return this.subList;
	}
}
