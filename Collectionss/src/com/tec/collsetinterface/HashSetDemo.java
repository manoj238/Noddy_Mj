package com.tec.collsetinterface;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		TreeSet<Integer> set2 = new TreeSet<>(set);
		System.out.println(set2);
		//collection.sort() method not applicable for set interface
		//since set is not index based
	}
}
