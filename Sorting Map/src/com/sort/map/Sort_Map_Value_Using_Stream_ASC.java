package com.sort.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sort_Map_Value_Using_Stream_ASC {

	private static LinkedHashMap<String, Integer> sortMapByValueAsc(Map<String, Integer> unSortMap) {
		LinkedHashMap<String, Integer> linkedHashMap = unSortMap.entrySet().stream()
				.sorted(Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return linkedHashMap;
	}

	public static void main(String[] args) {
		Map<String, Integer> unSortMap = new HashMap<>();
		unSortMap.put("fish", 10);
		unSortMap.put("hen", 30);
		unSortMap.put("ice", 20);
		unSortMap.put("egg", 40);
		unSortMap.put("girl", 70);
		unSortMap.put("dog", 50);
		unSortMap.put("ball", 90);
		unSortMap.put("cat", 80);
		unSortMap.put("apple", 60);

		// call the method
		LinkedHashMap<String, Integer> linkedHashMap = sortMapByValueAsc(unSortMap);

		System.out.println(linkedHashMap);
	}// main
}// class
