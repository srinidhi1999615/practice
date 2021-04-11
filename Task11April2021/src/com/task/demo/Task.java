package com.task.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
	int id;
	String name;
	long phone;
	
	public Task(int id,String name,long phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
	}
	public static void main(String[] args) {
	  
		Task task1 = new Task(1,"iphone",60000);
		Task task2 = new Task(2,"one plus",50000);
		Task task3 = new Task(3,"vivo",40000);
		Task task4 = new Task(4,"oppo",30000);
		Task task5 = new Task(5,"real me",350000);
		Task task6 = new Task(6,"redmi",20000);
		Task task7 = new Task(7,"nokia",10000);
		Task task8 = new Task(8,"jio",1000);
		Task task9 = new Task(9,"samsung",35000);
		Task task10 = new Task(10,"motorola",15000);

		List<Task> list = new ArrayList<Task>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		list.add(task5);
		list.add(task6);
		list.add(task7);
		list.add(task8);
		list.add(task9);
		list.add(task10);
		
		System.out.println(list);
		
		List<Task> list2 = new ArrayList<Task>();
		for(Task t : list) {
			System.out.println(t.name);
		}
		
		List<Long> list1 = new ArrayList<Long>();
		for(Task task : list) {
		System.out.println(task.phone);
		if(task.phone>30000) {
			list1.add(task.phone);

		}
		
	
		}
		System.out.println(list1);
			
		}
	}


