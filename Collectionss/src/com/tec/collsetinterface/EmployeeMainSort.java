package com.tec.collsetinterface;
import java.util.*;
public class EmployeeMainSort {
	public static void main(String[] args) {
		Set<Object> set = new LinkedHashSet<>();
		set.add(new EmployeeDemo(5,"Monikas" , 20000.0));
		set.add(new EmployeeDemo(1,"Chandler" , 30000.0));
		set.add(new EmployeeDemo(4,"Pheobe" , 40000.0));
		set.add(new EmployeeDemo(2,"Adam" , 50000.0));
		set.add(new EmployeeDemo(3,"Eve" , 60000.0));
		
		System.out.println(set);
		System.out.println("---------------LinkedHashSet-----------------------");
		for (Object object : set) {
			System.out.println(object);
		}
		
		TreeSet set2 = new TreeSet<>(set);
		System.out.println(set2);
		System.out.println("--------------TreeSet------------------------");
		for (Object object : set2) {
			System.out.println(object);
		}
		System.out.println("-----------------SortByName---------------------");
		LinkedList linkedList = new LinkedList<>(set);
		Collections.sort(linkedList,new SortByName());
		for (Object object : linkedList) {
			System.out.println(object);
		}
		System.out.println("-----------------SortBySal---------------------");
		Collections.sort(linkedList,new SortBySalary());
		for (Object object : linkedList) {
			System.out.println(object);
		}
	}
}
