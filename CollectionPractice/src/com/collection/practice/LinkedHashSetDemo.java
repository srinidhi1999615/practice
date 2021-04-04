package com.collection.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

			Set<String> set = new LinkedHashSet<String>();
			set.add("sri");
			set.add("srin");
			set.add("srini");
			set.add("srinid");
			set.add("srinidh");
			set.add("srinidhi");
			System.out.println("main method starts here");
			System.out.println(set);

			// remove
			set.remove("sri");
			// iterator
			System.out.println("Iterator starts here");
			Iterator<String> itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			// set iterator forward
			System.out.println("set iterator forward");
			Iterator<String> itr1 = set.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println("for each loop");
			// for each loop
			for (String element : set) {
				System.out.println(element);
			}

		}


	}


