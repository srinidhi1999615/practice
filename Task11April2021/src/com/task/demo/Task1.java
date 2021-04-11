package com.task.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("three");
		list1.add("four");
		System.out.println(list1);
		
		Collections.copy(list,list1);
		System.out.println("===============================");	
		System.out.println(list);
		System.out.println("===============================");
		if(list.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("list is not empty");
		}
		System.out.println("===============================");
		System.out.println(list.indexOf("four"));
		System.out.println(list.indexOf("three"));
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Srinidhi");
		hashSet.add("joshi");
	System.out.println("===============================");	
	List<String> list2 = new ArrayList<String>(hashSet);
	System.out.println(list2);
	
	
	}

}
