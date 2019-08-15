package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//1.	WAP to create a Treemap which contains Strings
public class Treemap_1st {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeMap ts = new TreeMap();
		System.out.println("Enter the key and value in treemap");
		int key;
		String value;
		for (int i = 1; i < 5; i++) {
			key = sc.nextInt();
			value = sc.next();
			ts.put(key, value);

		}
		System.out.println(ts);

	}
}
