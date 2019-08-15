package com.hefshine.collectionMap;

import java.util.HashMap;
import java.util.Scanner;

//7.	WAP to get only the Values from a HashMap
public class GetValue_7th {
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
		System.out.println("It returns all keys from hashmap");
		for (int i = 0; i < hs.size()+1; i++) {
			System.out.println(hs.get(i));
		}
	}

}
