package com.techelevat.inheritence;

import com.technoelevate.Human;

public class Alien extends Human{
	int aid;

	public Alien(String name, int age, float height, String dob, long contact_no, int aid) {
		super(name, age, height, dob, contact_no);
		this.aid = aid;
	}
	
	@Override
	public String sleep() {
		return "Rest In Peace";
	}
	
}
