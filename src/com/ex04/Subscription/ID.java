package com.ex04.Subscription;

import java.util.List;
import java.util.ArrayList;

public class ID {
	final int IDNumber;
	// To keep track, so that no duplicates arise
	static List<ID> IDsInUse = new ArrayList<ID>();
	
	public ID() {
		// Using random number instead of 0
		int idNumber = 0;
		this.IDNumber = idNumber;
		IDsInUse.add(this);
	}
	
	public ID(int id) {
		this.IDNumber = id;
	}

	public int getIDNumber() {
		return IDNumber;
	}
	

}
