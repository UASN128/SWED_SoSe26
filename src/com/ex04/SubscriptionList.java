package com.ex04;

import java.util.ArrayList;

public class SubscriptionList {
	private ArrayList<Subscription> subList;
	
	SubscriptionList(){
		this.subList = new ArrayList<>();
	}
	
	public void addSubscription(String name, String url, int noteFreq, String comChannel) {
		this.subList.add(new Subscription(name, url, noteFreq, comChannel));
	}
	
	public void delSubscription(String name) {
		int i = 0;
		for(Subscription sub : this.subList) {
			if(sub.getName() == name) {
				this.subList.remove(sub);
				i = 1;
			}
		}
		if( i == 0) System.out.println("No Subscription with this name");
		if( i == 1) System.out.println("Subscription(s) deleted");
	}
	
	public void modSubcription(String name, Subscription.Atribute atr, String str) {
		for(Subscription sub : subList) {
			if(sub.getName() == name) sub.changeSub(atr, str);
		}
	}
	public void modSubcription(String name, Subscription.Atribute atr, int i) {
		for(Subscription sub : subList) {
			if(sub.getName() == name) sub.changeSub(atr, i);
		}
	}
	public ArrayList<Subscription> getSubs(){
		return subList;
	}
}
