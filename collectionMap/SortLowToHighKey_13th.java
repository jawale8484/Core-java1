package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//13.	WAP to get the first (lowest) key and the last (highest) key currently in a TreeMap
public class SortLowToHighKey_13th {
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
		// ts.descendingMap();
		ts.descendingKeySet();

		System.out.println(ts);

	}
}
