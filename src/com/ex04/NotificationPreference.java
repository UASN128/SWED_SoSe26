package com.ex04;

public class NotificationPreference {
	Frequency frequency;
	CommunicationChannel CC;
	
	NotificationPreference(
			Frequency freq, CommunicationChannel CC){
		this.frequency = freq;
		this.CC = CC;
	}
}
