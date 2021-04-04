package com.collection.practice;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo{

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println(list.size());
		System.out.println(list);
		//remove
		list.remove("a");
		list.remove(2);
		System.out.println(list);
		//Iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//ListIterator forward
		System.out.println("list iterator forward");
		ListIterator<String> itr1 = list.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//ListIterator backward
		System.out.println("list iterator backward");
		ListIterator<String> itr2 = list.listIterator(list.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}
	

}
