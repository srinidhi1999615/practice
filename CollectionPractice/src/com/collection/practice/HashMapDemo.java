package com.collection.practice;

public class HashMapDemo {
	String name;
	String city;
	String country;

	
	HashMapDemo(String name,String city,String country){
		this.name=name;
		this.city= city;
		this.country=country;
	}
	public void display(){
		System.out.println("name : " + name);
		System.out.println("city : " + city);
		System.out.println("country : " + country);
	}


}
