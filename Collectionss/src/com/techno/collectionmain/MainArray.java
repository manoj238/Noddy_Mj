package com.techno.collectionmain;

import java.util.Iterator;

public class MainArray {

	public static void main(String[] args) {
		MyCustomArray customArray = new MyCustomArray(5);
		customArray.add(10);
		customArray.add(20);
		customArray.add(30);
		customArray.add(40);
		customArray.add(50);
		customArray.add(60);
		customArray.add(70);
		customArray.add(80);
		customArray.add(90);
		customArray.add(100);
		customArray.add(110);
		customArray.remove1(50);
		
		System.out.println(customArray);
		
		for (int i = 0; i < customArray.size(); i++) {
			System.out.println(customArray.get(i));
		}
		System.out.println("ArraySize "+customArray.size());
		
		System.out.println("---using foreach-------");
		for (Object object : customArray) {
			System.out.println(object);
		}
		
		System.out.println("---using iterator-------");
		Iterator iterator = customArray.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}
