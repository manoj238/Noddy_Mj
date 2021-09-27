package com.tech.collectionframework;

import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		
		System.out.println("-------------forloop-------------------");
		//using for loop
		 for (int i = 0; i < arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		 System.out.println("------------foreach loop--------------------");
	   //using foreach loop
		 for (Integer integer : arraylist) {
			System.out.println(integer);
		}
		 System.out.println("-----------iterator---------------------");
	   //using iterator
	   //example for abstraction
		 Iterator iterator = arraylist.iterator();
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		 System.out.println("---------------listiterator forward-----------------");
	  //using listiterator
	     ListIterator listIterator = arraylist.listIterator();
	     while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	     System.out.println("-------------listiterator Backward-------------------");
	     //backward
	     ListIterator listIterator1 = arraylist.listIterator(arraylist.size());
	     while (listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
		}
	}
}
