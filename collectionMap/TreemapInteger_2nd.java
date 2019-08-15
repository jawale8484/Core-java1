package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//2.	WAP to create a Treemap which contains Integers
public class TreemapInteger_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		TreeMap ts = new TreeMap();
		System.out.println("Enter the key(integer) and value(integer) in treemap");
		int key;
		int value;
		for (int i = 1; i < 5; i++) {
			key = sc.nextInt();
			value = sc.nextInt();
			ts.put(key, value);
		}

	}
}
