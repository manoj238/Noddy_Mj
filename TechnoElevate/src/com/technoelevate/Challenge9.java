package com.technoelevate;

public class Challenge9 {
	public int getEvenDigitSum(int num) {
		int even = 0;
		int sum = 0;
		while (num != 0 && num>0) {
			even = num % 10;
			if (even % 2 == 0) {
				sum = sum + even;
			}
			num = num / 10;
		}
		return sum;
	}
}
