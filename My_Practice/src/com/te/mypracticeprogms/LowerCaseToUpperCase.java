package com.te.mypracticeprogms;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		String string = "heLLoWoRlDHowArEYOuaLl";
		String string2 = "";
		for (int i = 0; i < string.length(); i++) {
			Character character = string.charAt(i);
			if(character>='A' && character<='Z') {
				string2 = string2 + character.toString().toLowerCase();
			}else {
				string2 = string2 + character.toString().toUpperCase();
			}
		}
		System.out.println(string2);
	}
}
