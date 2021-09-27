package com.technoelevate;

public class Challenge6 {

	public void loopfor() {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (count >= 5) {
				break;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
				count++;
				System.out.println(i+" ");
			}
		}
		System.out.println("Total:"+sum);
	}
}
