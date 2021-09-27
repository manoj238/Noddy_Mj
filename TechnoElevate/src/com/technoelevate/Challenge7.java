package com.technoelevate;

public class Challenge7 {
	public boolean isOdd(int number) {
		if (number > 0 && number % 2 == 1) {
			return true;
		} else
			return false;
	}

	public int sumOdd(int first, int last) {
		if (last >= first && first >= 0) {
			int sum = 0;
			for (int i = first; i <= last; i++) {
				boolean ans = isOdd(i);
				if (ans) {
					sum = sum + i;
				}
			}
			return sum;
		}
		return -1;
	}
}
