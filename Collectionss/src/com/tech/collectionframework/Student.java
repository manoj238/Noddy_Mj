package com.tech.collectionframework;

import java.util.Objects;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
//	@Override
//	public int compareTo(Student o) {
//		return this.hashCode()-o.hashCode();
//	}
	@Override
	public int compareTo(Student o) {
		return this.name.length()-o.name.length();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	
//	@Override
//	public int compareTo(Student o) {
//		return o.name.compareTo(this.name);
//	}
}
