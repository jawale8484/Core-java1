package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//8.	WAP to delete all elements from a given TreeMap
public class DeleteAllTreemap_8th {
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
		System.out.println("deleting all entries from treemap...");
		ts.clear();
System.out.println("Empty treemap "+ts.isEmpty());
	}
}
