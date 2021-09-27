package com.technoelevate.driver;
import com.technoelevate.Challenge1;
public class User {

	
	
	public static void main(String[] args)
	{
		Challenge1 c=new Challenge1();
		Challenge1 c1=new Challenge1();
		System.out.println(c.add(235, 333));
		System.out.println(c.add(23.5f, 56.8f));
		System.out.println(c.add(87.6, 68.3));
		System.out.println(c.add(105.2, 333));
		System.out.println(c.add('a','g'));
		System.out.println(c.add(73.4, 37.3));
		String s1=c.logOut();
		System.out.println(s1);
	}
	
}
