package com.technoelevate;

public class Area {
	
	public double area(double radius) {
		if(radius>=0) {
			double aoc=3.14*radius*radius;
			return aoc;
		}
			return -1.0;
	}
	
	public double area(double x,double y) {
		if(x>0 && y>0) {
			double aor=x*y;
			return aor;
		}
			return -1.0;
	}
}
