package com.technoelevate;

public class Challenge12 {
	
	public void  printFactors(int fact) {
		for(int i=1;i<fact;i++) {
			if(fact%i==0)
				System.out.println(i);
		}
	}
}
