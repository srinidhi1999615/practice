package com.collection.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMapDemo h1 = new HashMapDemo("SRINIDHI", "HYD", "INDIA");
		HashMapDemo h2 = new HashMapDemo("JOSHI", "HYD", "INDIA");
		HashMapDemo h3 = new HashMapDemo("ABC", "HYD", "INDIA");
		HashMapDemo h4 = new HashMapDemo("XYZ", "HYD", "INDIA");

		Map<String, HashMapDemo> hm = new HashMap<String, HashMapDemo>();

		// add key-value pair to hashmap
		hm.put("Srinidhi", h1);
		hm.put("joshi", h2);
		hm.put("abc", h3);
		hm.put("xyz", h4);

		HashMapDemo value = hm.get("abc");
		value.display();

		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is: ");
			HashMapDemo obj = hm.get(key);
			obj.display();
		}

		hm.remove("XYZ");
		System.out.println(hm);
		hm.remove("ABC", h3);
		System.out.println(hm);
	}

}
