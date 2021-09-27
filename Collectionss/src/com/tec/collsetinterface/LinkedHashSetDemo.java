package com.tec.collsetinterface;
import java.util.*;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(30);
		set.add(40);
		System.out.println(set);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(set);
	}
}
