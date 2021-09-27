package com.te.multithreading;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bangalore","Delhi","Mumbail","Bhopal","Hyderbadh");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("------------------------");
		
		list.forEach(m -> System.out.println(m));
	}
}
