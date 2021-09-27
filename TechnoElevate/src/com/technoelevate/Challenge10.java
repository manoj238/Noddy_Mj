package com.technoelevate;

public class Challenge10 {
	public boolean hasShareDigit(int a1, int b1) {
		if (a1 < 10 && b1 > 100) {
			return false;
		}
		int sum1 = a1 / 10;
		a1 = a1 % 10;
		int sum2 = b1 / 10;
		b1 = b1 % 10;

		if (sum1 == sum2 || sum1 == b1) {
			return true;
		}
		if (a1 == sum2 || a1 == b1) {
			return true;
		}
		return false;

	}
}
