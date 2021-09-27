package com.tec.exception;

import java.util.Scanner;

public class UnCheckedException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scanner.nextInt();
		System.out.println("Enter the denominator");
		int b = scanner.nextInt();
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			System.out.println("Please enter valid number");
		}
		finally {
			scanner.close();		
		}
	}
}
