package com.tech.collectionframework;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(1,30);
		linkedlist.add(40);
		linkedlist.remove(2);
		System.out.println("--------------------forloop--------------");
		for (int i = 0; i <linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}
		
		System.out.println("--------------------foreachloop--------------");
		for (Integer integer : linkedlist) {
			System.out.println(integer);
		}
		System.out.println("--------------------iterator--------------");
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------ListIterator--------------");
		ListIterator iterator2 = linkedlist.listIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());	
		}
		System.out.println("--------------------ListIterator--------------");
		ListIterator iterator3 = linkedlist.listIterator(linkedlist.size());
		while (iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());
		}

	}

}
