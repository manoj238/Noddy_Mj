package com.te.practicesession;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Manoj Vivek";
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			char c[] = ar[i].toCharArray();
			for (int j = c.length - 1; j >= 0; j--) {
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		/*
		 * int len = s.length(); String revString = ""; for (int i = len-1; i >= 0; i--)
		 * { System.out.print(s.charAt(i)); }
		 */
	}
}
