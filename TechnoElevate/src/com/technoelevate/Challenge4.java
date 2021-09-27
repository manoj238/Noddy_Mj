package com.technoelevate;

public class Challenge4 {

	public String isCatPlaying(boolean summer,int temperature) {
		if(!summer && temperature>25 && temperature<35) {
			return "Cat is Playing";
		}else if(summer && temperature>25 && temperature<45) {
			return "Cat is Playing in summer";
		}
		return "Cat is not Playing";
	}
}
