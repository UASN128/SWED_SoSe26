package com.ex04.Subscription;

import java.util.Date;
// import java.text.SimpleDateFormat; // might be Usefull later

public class Website {
	final String URL;
	String content;
	Date lastChecked;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getLastChecked() {
		return lastChecked;
	}

	public void setLastChecked(Date lastChecked) {
		this.lastChecked = lastChecked;
	}

	public String getURL() {
		return URL;
	}

	public Website(String URL, String content){
		this.URL = URL;
		this.content = content;
		this.lastChecked = new Date();
		this.lastChecked.setTime(0);
	}
	
}
