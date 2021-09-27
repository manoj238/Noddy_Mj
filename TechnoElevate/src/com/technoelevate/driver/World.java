package com.technoelevate.driver;
import com.techelevat.inheritence.Alien;
import com.technoelevate.Human;
public class World {
	public static void main(String[] args) {
		Human h=new Human("ManojVivek", 23, 5.3f, "23/08/1998", 9871234567l);
		//System.out.println(h.getName()+"\n"+ h.getAge()+"\n"+h.getHeight()+"\n"+h.getDob()+"\n"+h.getContact_no()+"\n"+);
		System.out.println(h.sleep());
		Alien a1=new Alien("Manju", 5000, 15, "10-08-96", 5367897612l, 1);
		//System.out.println(a1.getName()+"\n"+ a1.getAge()+"\n"+a1.getHeight()+"\n"+a1.getDob()+"\n"+a1.getContact_no()+"\n"+a1.sleep());
		System.out.println(a1.sleep());
		Alien a2=new Alien("Sundri", 17, 3f, "10-10-10", 546378292167l, 2) {
			@Override
			public String sleep() {
				return "Sundri sleeping ";
			}

		};
		System.out.println(a2.sleep());
		Alien a3=new Alien("Sundra", 20, 8, "12-12-12", 876542345678l, 3);
		System.out.println(a3.sleep());
	}
}
