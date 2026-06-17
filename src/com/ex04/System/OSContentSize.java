package com.ex04.System;

import com.ex04.Subscription.Website;

public class OSContentSize implements ObserverStrategy{
	
	@Override
	public boolean compare(Website copiedWebsite, Website website) {
		String oldSite = copiedWebsite.getContent();
		String newSite = website.getContent();
		if (oldSite.length() == newSite.length()) {
			return true;
		} else {
			return false;
		}

	}

}
