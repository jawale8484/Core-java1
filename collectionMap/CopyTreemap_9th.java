package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//9.	WAP to copy a TreeMap content to another TreeMap
public class CopyTreemap_9th {
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
		System.out.println("Elements from first treemap "+ts);
TreeMap newts=new TreeMap(ts);
System.out.println("elements from new treemap "+newts);
	}
}
