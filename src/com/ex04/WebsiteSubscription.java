package com.ex04;

public class WebsiteSubscription {
	final ID id;
	final ID userID;
	final Website website;
	NotificationPreference NP;
	
	public WebsiteSubscription(
			ID userID, Website website,
			NotificationPreference NP) {
		int idNumber = 0; // would be replaced with random unused number
		this.id = new ID(idNumber);
		this.userID = userID;
		this.website = website;
		this.NP = NP;
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

