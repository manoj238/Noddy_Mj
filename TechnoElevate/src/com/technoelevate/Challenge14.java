package com.technoelevate;

public class Challenge14 {
	public boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		bigCount=bigCount*5;
 		int temp1=goal/bigCount;
		int temp2=goal%bigCount;
		if(temp2<smallCount && temp1>0) {
			return true;
		}
		else if(temp2<smallCount) {
			return true;
		}
		return false;
	}
}
