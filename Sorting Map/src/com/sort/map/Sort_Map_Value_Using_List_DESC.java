package com.sort.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_Map_Value_Using_List_DESC {

	public static void main(String[] args) {
		Map<String, Integer> unSortMap = new HashMap<>();
		unSortMap.put("fish", 60);
		unSortMap.put("hen", 80);
		unSortMap.put("ice", 90);
		unSortMap.put("egg", 50);
		unSortMap.put("girl", 70);
		unSortMap.put("dog", 40);
		unSortMap.put("ball", 20);
		unSortMap.put("cat", 30);
		unSortMap.put("apple", 10);
		System.out.println("Unsorted Map");
		System.out.println(unSortMap);
		System.out.println("===============================================");

		// convert the map into list
		List<Entry<String, Integer>> list = new ArrayList<>(unSortMap.entrySet());
		System.out.println("Display List");
		System.out.println(list);
		System.out.println("=================================================");

		// sort the list using Collections.sort() method
		Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		// display the Map in Descending Order
		System.out.println("display the Map in Descending Order [Values]");

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "-------" + entry.getValue());
		}
	}
}
