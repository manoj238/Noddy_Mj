package com.technoelevate;

public class Challenge8 {
	public void sumFirstAndLastDigit(int number) {
		int fdig = 0;
		int ldig = 0;
		if (number <= 99) {
			fdig = number / 10;
			ldig = number % 10;
		} else if (number > 100) {
			fdig = number / 100;
			ldig = number % 100;
		}
		int sum = fdig + ldig;
		System.out.println(sum);
	}
}
