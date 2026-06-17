package com.ex04.Subscription;

public class CommunicationChannel {
	String communicationChannel;
	
	public CommunicationChannel(){
		this.communicationChannel = "";
	}
	
	public CommunicationChannel(String cc){
		this.communicationChannel = cc;
	}

	public String getCommunicationChannel() {
		return communicationChannel;
	}

	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	
}
