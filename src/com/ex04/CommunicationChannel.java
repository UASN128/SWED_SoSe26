package com.ex04;

public class CommunicationChannel {
	String communicationChannel;
	
	CommunicationChannel(){
		this.communicationChannel = "";
	}
	
	CommunicationChannel(String cc){
		this.communicationChannel = cc;
	}

	public String getCommunicationChannel() {
		return communicationChannel;
	}

	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	
}
