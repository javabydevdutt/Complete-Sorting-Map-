package com.sort.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_Map_Key_Using_List_ASC {

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
		System.out.println(unSortMap);

		// Convert the map in to list
		List<Entry<String, Integer>> list = new ArrayList<>(unSortMap.entrySet());// Or
		// List<Map.Entry<String,Integer>> list= new ArrayList<>(unSortMap.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		// display the Map in Ascending Order
		System.out.println("display the Map in Ascending Order [Key]");

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "-------" + entry.getValue());
		}
	}// main
}// class
