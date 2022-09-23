package com.sort.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Tree Map having Default Sorting Order
public class Sort_Map_Using_TreeMap_Asc {

	public static void main(String[] args) {
		Map<String, Integer> unSortMap = new HashMap<String, Integer>();
		unSortMap.put("fish", 60);
		unSortMap.put("hen", 80);
		unSortMap.put("ice", 90);
		unSortMap.put("egg", 50);
		unSortMap.put("girl", 70);
		unSortMap.put("dog", 40);
		unSortMap.put("ball", 20);
		unSortMap.put("cat", 30);
		unSortMap.put("apple", 10);
		System.out.println(unSortMap);

		// Sorting using TreeMap
		Map<String, Integer> sortMap = new TreeMap<>(unSortMap);

		// Display each element in ascending order
		System.out.println("Display each element in ascending order");
		for (Map.Entry<String, Integer> entry : sortMap.entrySet()) {
			System.out.println(entry.getKey() + " -------" + entry.getValue());
		}
	}
}
