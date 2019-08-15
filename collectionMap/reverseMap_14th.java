package com.hefshine.collectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//14.	WAP to get a reverse order view of the keys contained in a given map TreeMap
public class reverseMap_14th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap ts = new TreeMap();
		int key;
		String value;
		System.out.println("Enter the key and value in treemap");
		for (int i = 0; i < 5; i++) {
			key = sc.nextInt();
			value = sc.next();
			ts.put(key, value);

		}
	System.out.println("Normal treeset"+ts);
	System.out.println(ts.descendingMap());
	
	}
}
