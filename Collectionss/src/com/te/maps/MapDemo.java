package com.te.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.put(23, "Tiger"));
		System.out.println(map.put(14, "Lion"));
		System.out.println(map.put(55, "Deer"));
		System.out.println(map.put(82, "Chetha"));
		System.out.println(map.put(34, "Leapord"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		Set set = new TreeSet(map.keySet());
		System.out.println(set);
		
	}
}
