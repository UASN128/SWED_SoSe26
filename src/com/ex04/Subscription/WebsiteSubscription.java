package com.ex04.Subscription;

import com.ex04.System.Observer;

import java.util.List;
import java.util.ArrayList;

public class WebsiteSubscription {
	final ID id;
	final ID userID;
	final Website website;
	NotificationPreference NP;
	List<Observer> observers;
	
	public WebsiteSubscription(
			ID userID, Website website,
			NotificationPreference NP) {
		int idNumber = 0; // would be replaced with random unused number
		this.id = new ID(idNumber);
		this.userID = userID;
		this.website = website;
		this.NP = NP;
		this.observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public NotificationPreference getNP() {
		return NP;
	}

	public void setNP(NotificationPreference nP) {
		NP = nP;
	}

	public ID getId() {
		return id;
	}

	public ID getUserID() {
		return userID;
	}

	public Website getWebsite() {
		return website;
	}
}

