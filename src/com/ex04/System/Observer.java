package com.ex04.System;

import com.ex04.Subscription.WebsiteSubscription;
import com.ex04.Subscription.Website;

public class Observer {
	WebsiteSubscription WS;
	Website websiteCopy;
	ObserverStrategy ObStrat;
	
	public Observer(WebsiteSubscription WS) {
		this.WS = WS;
		copyWebsite();
		WS.addObserver(this);
		ObStrat = null;
	}
	
	public void copyWebsite() {
		this.websiteCopy = WS.getWebsite();
	}
	
	public void setStrat(ObserverStrategy OS) {
		this.ObStrat = OS; 
	}
	
	public void checkForUpdate() {
		boolean unchanged;
		unchanged = this.ObStrat.compare(websiteCopy, this.WS.getWebsite());
		if (unchanged) {
			System.out.println("No Update detected");
		} else {
			System.out.println("Update detected");
		}
	}
	
	
	public void displayWebsite() {
		System.out.println(websiteCopy.getURL());
		System.out.println(websiteCopy.getContent());
	}

}
