package com.te.mypracticeprogms;

public class SplitDemo {

	public static void main(String[] args) {
		String string = "My name is manoj";
		String str[] = string.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
