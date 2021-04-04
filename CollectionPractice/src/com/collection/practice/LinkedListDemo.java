package com.collection.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("east");
		list.add("west");
		list.add("north");
		list.add("south");
		System.out.println("main method starts here");
		System.out.println(list);
		// remove
		System.out.println("removing ");
		list.remove(1);
		System.out.println(list);

		//// Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// ListIterator forward
		System.out.println("list iterator forward");
		ListIterator<String> itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		// ListIterator backward
		System.out.println("list iterator backward");
		ListIterator<String> itr2 = list.listIterator(list.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
