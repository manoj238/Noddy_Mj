package com.te.multithreading;
public class LamdaExpressionDemo {
	public static void main(String[] args) {
		Demo demo = () -> System.out.println("Lamda Method is Running....!");

		demo.stuff();
	}
}
