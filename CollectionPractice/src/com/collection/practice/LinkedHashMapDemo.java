package com.collection.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		HashMapDemo h5 = new HashMapDemo("S", "sec", "INDIA");
		HashMapDemo h6 = new HashMapDemo("J", "sec", "INDIA");
		HashMapDemo h7 = new HashMapDemo("A", "sec", "INDIA");
		HashMapDemo h8 = new HashMapDemo("X", "sec", "INDIA");

		Map<String, HashMapDemo> hm = new LinkedHashMap<String, HashMapDemo>();
		// adding key values
		hm.put("S", h5);
		hm.put("J", h6);
		hm.put("A", h7);
		hm.put("X", h8);

		Set<String> keys = hm.keySet();
		for (String element : keys) {
			System.out.println("the value of " + element + "is");
			HashMapDemo obj1 = hm.get(element);
			obj1.display();
		}

	}

}
