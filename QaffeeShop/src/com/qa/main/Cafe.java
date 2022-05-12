package com.qa.main;

import java.util.ArrayList;

public class Cafe {

	public static ArrayList<String> orders = new ArrayList<>();
	
	// They don't take in values
	public static boolean addOrder(String order) {
return orders.add(order);
		// Methods should always return 'something' making testing the code easier
		
	}
	public static String removeOrder(int index) {
		return orders.remove(index);
	}
	
	public static String updateOrder(int index, String order) {
		return orders.set(index, order);
	}
	
	public static String getOneOrder(int index) {
		return orders.get(index);
	}
	// Returns our orders arrayList
	// void --> ArrayList<String>
	public static ArrayList<String> getOrders() {
		return orders;
	}
	public static boolean clearOrders() {
		return true;
		
	}
}
