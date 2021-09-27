package com.te.multithreading;

public class MyDemo1 {
	
	public void getMessage() {
		System.out.println("Non static methods messge");
	}
	
	public MyDemo1(){
		System.out.println("my demo constructor");
	}
	
	public static void main(String[] args) {
		Sayable sayable =new MyDemo1()::getMessage;
		sayable.say();
		Sayable sayable2 = MyStaticDemo::myMessage;
		sayable2.say();
		Sayable sayable3 = MyDemo1::new;
		sayable3.say();
	}

}
