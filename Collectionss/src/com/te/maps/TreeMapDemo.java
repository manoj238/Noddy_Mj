package com.te.maps;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap();
		map.put(12, "Orange");
		map.put(22, "Apple");
		map.put(63, "Grapes");
		map.put(51, "Mango");
		map.put(46, "Kiwi");
		map.put(37, "PineApple");
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
		for (Entry<Integer, String> entry2 : entry) {
			System.out.println(entry2.getKey()+" "+entry2.getValue());
		}
		
		for (int i = 0; i < entry.size(); i++) {
			System.out.println(map.keySet()+" "+map.values());
		}
	
	}
}
