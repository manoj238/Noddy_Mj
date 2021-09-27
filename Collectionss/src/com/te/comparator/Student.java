package com.te.comparator;

public class Student {
	 int id;
	 String name;
	 int age;
	 String place;
	public Student(int id, String name, int age, String place) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", place=" + place + "]";
	}
}
