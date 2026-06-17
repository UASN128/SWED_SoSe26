package com.ex04;
import com.ex04.System.*;
import com.ex04.System.SubSystem;
import com.ex04.Subscription.*;

public class Main {
	
	public static void main(String[] args) {	
		SubSystem subby = new SubSystem();
		createTestEntry(subby);
	}
	
	public static void createTestEntry(SubSystem subby) {
		// User Boiuser = subby.getUserList().getFirst();
		// subby.addUser("Boi");
		User Boiuser = new User("Boi");
		subby.addUser(Boiuser);	
		NotificationPreference NP = 
				new NotificationPreference(
						new Frequency(3),
						new CommunicationChannel("TouYube"));
		Website testSite = new Website("https://MooYube.fart", "gotem");
		subby.addWebsiteSubscription(
				Boiuser.getID(), testSite, NP);
	}
	
	public static void accessTestEntry(SubSystem subby) {
		WebsiteSubscription WebSub = subby.getSubList().getFirst();
		System.out.println(WebSub.getWebsite().getURL());
		System.out.println(WebSub.getWebsite().getContent());
	}
	
}
