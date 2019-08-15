package com.hefshine.collectionMap;

import java.util.*;

//3.	WAP to search a key in a TreeMap
//4.	WAP to search a value in a TreeMap
public class SearchKey_3rd_4th {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap ts = new TreeMap();
		int key;
		String value;
		System.out.println("ENter the key and value in treemap");
		for (int i = 0; i < 5; i++) {
			key = sc.nextInt();
			value = sc.next();
			ts.put(key, value);

		}
		System.out.println("Enter the key to search");
		int Searchingkey = sc.nextInt();
		System.out.println("is there key available or not");
		System.out.println(ts.containsKey(Searchingkey));
		
		System.out.println("Enter the value available or not");
		String searchingvalue = sc.next();
		
		System.out.println("Is there value is avilable or not \n"+ts.containsValue(searchingvalue));

	}
}
