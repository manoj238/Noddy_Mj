package com.tec.exception;

public class DefaultExceptionHandlingDemo {
	public static void m1() {
		System.out.println("Welcome to m1");
	}
	public static void m2() {
		m1();
		System.out.println("welcome to m2");
	}
	public static void main(String[] args) {
		m2();
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
