package com.te.practicesession;

public class PalinString {

	public static void main(String[] args) {
		String string = "dad";
		int len = string.length();
		String tempString = string;
		String revString = "" ;
		for (int i = len-1; i >=0; i--) {
			revString=revString+string.charAt(i);
		}
		if(tempString.equalsIgnoreCase(revString)) {
			System.out.println("palindrome");
		}else
		System.out.println("not a palindrome");
	}

}
