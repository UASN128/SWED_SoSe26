package com.ex04.System;

import com.ex04.Subscription.WebsiteSubscription;
import com.ex04.Subscription.Website;

public class Observer {
	WebsiteSubscription WS;
	Website websiteCopy;
	
	public Observer(WebsiteSubscription WS) {
		this.WS = WS;
		copyWebsite();
	}
	
	public void copyWebsite() {
		this.websiteCopy = WS.getWebsite();
	}
	
	public void displayWebsite() {
		System.out.println(websiteCopy.getURL());
		System.out.println(websiteCopy.getContent());
	}

}
