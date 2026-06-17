package com.ex04.System;

import com.ex04.Subscription.Website;

public interface ObserverStrategy {
	boolean compare(Website copiedWebsite, Website website);
}
