package com.technoelevate;
import lombok.Data;
@Data
public class Human {
	private String name;
	private int age;
	private float height;
	private String dob;
	private long contact_no;
	public Human(String name, int age, float height, String dob, long contact_no) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.dob = dob;
		this.contact_no = contact_no;
	}
	public Human() {
	}
	
	public String sleep(){
		return "Relax-----peace----aram";
	}
	
}
