package com.ex04.System;

import com.ex04.Subscription.Website;

public class OSUrl implements ObserverStrategy {

	@Override
	public boolean compare(Website copiedWebsite, Website website) {
		String oldSite = copiedWebsite.getURL();
		String newSite = website.getURL();
		if (oldSite.contentEquals(newSite)) {
			return true;
		} else {
			return false;
		}
	}

}
