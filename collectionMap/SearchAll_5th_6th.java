package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//5.	WAP to get all keys from the given a TreeMap

public class SearchAll_5th_6th {
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
		System.out.println("it returns all keys and value");
		for (int i = 0; i < ts.size()+1; i++) {
			System.out.println(ts.keySet());
		}

	}
}
