package com.te.multithreading;

public class MyDemo {
	
	public static void message() {
		System.out.println("I am Message");
	}
	public static void main(String[] args) {
		Sayable sayable = MyDemo::message;
		sayable.say();
	}
}
