package com.technoelevate.driver;

import com.technoelevate.Time;

public class MainTime {

	public static void main(String[] args) {
		Time t=new Time();
		System.out.println(t.getDurationString(90,45));
		System.out.println(t.getDurationString(90));
	}

}
