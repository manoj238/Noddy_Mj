package com.te.treesetex;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(30);
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(60);
		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(25);
		treeSet.add(90);
		
		System.out.println(treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.headSet(40));
		System.out.println(treeSet.tailSet(30));
		System.out.println(treeSet.contains(20));
		System.out.println(treeSet.retainAll(treeSet));
	}

}
