package com.technoelevate;

public class Challennge11 {

	public boolean hasSameLastDigit(int a,int b,int c) {
		if(a>10 && b>10 && c>10 || a<1000 && b<1000 && c<1000) {
			int flast=a%10;
			int slast=b%10;
			int tlast=c%10;

			if(flast==slast || flast==tlast) 
				return true;
		}
		return false;
	}
}
