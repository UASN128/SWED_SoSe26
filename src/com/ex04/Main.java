package com.ex04;
import com.ex04.System.*;
import com.ex04.System.System;
import com.ex04.Subscription.*;

public class Main {
	public static void main(String[] args) {	
	System subby = new System();
	subby.addUser("Boi");
	User Boiuser = subby.getUserList().getFirst();
	NotificationPreference NP = 
			new NotificationPreference(
					new Frequency(3),
					new CommunicationChannel("TouYube"));
	Website testSite = new Website("https://MooYube.fart", "gotem");
	subby.addWebsiteSubscription(
			Boiuser.getID(), testSite, NP);
	}
}
