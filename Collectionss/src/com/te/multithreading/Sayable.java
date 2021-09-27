package com.te.multithreading;
@FunctionalInterface
public interface Sayable {
	void say();
	default void m1() {
		
	}
	
	static void m2() {
		
	}
	static void m3() {
		System.out.println("static method");
	}
}
