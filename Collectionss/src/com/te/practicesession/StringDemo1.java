package com.te.practicesession;

public class StringDemo1 {

	public static void main(String[] args) {
		String s = "my name is manoj";
		String str[] = s.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
