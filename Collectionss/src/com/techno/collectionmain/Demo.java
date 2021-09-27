package com.techno.collectionmain;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList.toString());
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Manoj");
		arrayList2.add("Is");
		arrayList2.add("great");
		arrayList2.add("guy");
		System.out.println(arrayList2.toString());

		ArrayList arrayList3 = new ArrayList();
		arrayList3.addAll(arrayList);
		for (Object object : arrayList3) {
			System.out.println(object);
		}
		arrayList3.addAll(arrayList2);
		for (Object object : arrayList3) {
			System.out.println(object);
		}
//		System.out.println(arrayList3.toString());

	}

}
