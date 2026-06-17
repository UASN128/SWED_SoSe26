package com.ex04.Subscription;

public class NotificationPreference {
	Frequency frequency;
	CommunicationChannel CC;
	
	public NotificationPreference(
			Frequency freq, CommunicationChannel CC){
		this.frequency = freq;
		this.CC = CC;
	}
}
