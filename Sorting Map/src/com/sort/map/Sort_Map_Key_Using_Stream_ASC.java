package com.sort.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_Map_Key_Using_Stream_ASC {

	private static LinkedHashMap<String, Integer> sortMapByKey(Map<String, Integer> unSortMap) {
		LinkedHashMap<String, Integer> linkedHashMap = unSortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValues, newValue) -> oldValues,
						LinkedHashMap::new));
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
		LinkedHashMap<String, Integer> linkedHashMap = sortMapByKey(unSortMap);

		System.out.println(linkedHashMap);
	}
}
