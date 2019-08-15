package com.hefshine.collectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//10.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
public class IterateHashmap_10th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		int key;
		String value;
		System.out.println("ENter the key and value in Hashmap");
		for (int i = 0; i < 5; i++) {
			key = sc.nextInt();
			value = sc.next();
			hs.put(key, value);

		}
		Iterator itr = hs.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
