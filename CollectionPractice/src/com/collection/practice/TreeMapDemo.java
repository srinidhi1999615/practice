package com.collection.practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		HashMapDemo h9 = new HashMapDemo("a", "sec1", "INDIA");
		HashMapDemo h10 = new HashMapDemo("b", "sec1", "INDIA");
		HashMapDemo h11 = new HashMapDemo("c", "sec1", "INDIA");
		HashMapDemo h12 = new HashMapDemo("d", "sec1", "INDIA");

		Map<String, HashMapDemo> hm = new TreeMap<String, HashMapDemo>();
		// adding key values
		hm.put("a", h9);
		hm.put("b", h10);
		hm.put("c", h11);
		hm.put("d", h12);

		Set<String> keys = hm.keySet();
		for (String element : keys) {
			System.out.println("the value of " + element + " is");
			HashMapDemo obj2 = hm.get(element);
			obj2.display();
		}

	}

}
