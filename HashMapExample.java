//package com.example;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(null,"Z");//one null key but multiple null value
		map.put(3,"C");
		map.put(4,"D");
		map.put(1,"A");
		map.put(2,"B");
		System.out.println(map);
		map.put(3, "E");
		System.out.println(map);
		String valAt3=map.get(3);
		System.out.println(valAt3);
		map.put(100, "F");
		if(map.containsKey(100)) {
			String valAt100=map.get(100);
			System.out.println(valAt100);
		}
		map.put(5, "A");
		System.out.println(map);
		for(Map.Entry<Integer, String> entry:map.entrySet()) {//interation
			System.out.println("Key:"+entry.getKey());
			System.out.println("Value:"+entry.getValue());
		}
		System.out.println("default:"+map.getOrDefault(100, "NA"));
		System.out.println("All keys:"+map.keySet());
	}

}
