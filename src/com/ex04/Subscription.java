package com.ex04;

public class Subscription {
	private String name;
	private String url;
	private int noteFreq;
	private String comChannel;
	
	public static enum Atribute {URL, NOTEFREQ, COMCHANNEL}
	
	Subscription(String name, String url, int noteFreq, String comChannel){
		this.name = name;
		this.url = url;
		this.noteFreq = noteFreq;
		this.comChannel = comChannel;
	}
	
	private void changeUrl(String url) {
		this.url = url;
	}
	
	private void changeNoteFreq(int nf) {
		this.noteFreq = nf;
	}
	
	private void changeComChannel(String cc) {
		this.comChannel = cc;
	}
	
	public void changeSub(Atribute atr, String str){
		switch (atr) {
		case URL:
			this.changeUrl(str);
			break;
		case COMCHANNEL:
			this.changeComChannel(str);
			break;
		default:
			System.out.println("invalid selection");
		}
	}
	
	public void changeSub(Atribute atr, int i) {
		switch (atr) {
		case NOTEFREQ:
			this.changeNoteFreq(i);
			break;
		default:
			System.out.println("invalid selection");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public int getNoteFreq() {
		return this.noteFreq;
	}
	
	public String getComChannel() {
		return this.comChannel;
	}
	
	public boolean checkChange() {
		// if(site unchanged) return false;
		return true;
	}

}
