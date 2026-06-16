package com.ex04.System;

import com.ex04.Subscription.ID;
import com.ex04.Subscription.Update;

public class Notification {
	ID userID;
	Update update;
	
	Notification(ID userID, Update update){
		this.userID = userID;
		this.update = update;
	}
	

}
