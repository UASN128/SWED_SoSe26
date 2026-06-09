package com.ex04;

import java.util.Date;
// import java.text.SimpleDateFormat; // might be Usefull later

public class Website {
	final String URL;
	String content;
	Date lastChecked;
	
	Website(String URL, String content){
		this.URL = URL;
		this.content = content;
		this.lastChecked = new Date();
		this.lastChecked.setTime(0);
	}
	
}
