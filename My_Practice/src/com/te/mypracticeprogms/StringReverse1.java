package com.te.mypracticeprogms;
public class StringReverse1 {
	public static void main(String[] args) {
		String string = "Hello World";
		int len=string.length();
		for(int i =len-1;i>=0;i--) {
			System.out.print(string.charAt(i));
		}
	}
}
