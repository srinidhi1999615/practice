package com.collection.practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println(list);
		list.remove(1);
		// remove
		System.out.println(list);
		list.add(1, "two");
		System.out.println(list);

		// Iterator

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//forward iterator
		System.out.println("forward iterator");
		ListIterator<String> itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//previous iterator
		System.out.println("previous iterator");
		ListIterator<String> itr2 = list.listIterator(list.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("for each loop starts here");
		// for each
		for (String element : list) {
			System.out.println(element);
		}

	}

}
