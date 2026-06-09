package com.ex04;

import java.util.ArrayList;
import java.util.List;

public class System {
	List<WebsiteSubscription> SubList;
	
	public System() {
		this.SubList = new ArrayList<WebsiteSubscription>();
	}

	public List<WebsiteSubscription> getSubList() {
		return SubList;
	}
}
