package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.HashMap;

//6.	WAP to get only the Keys from a HashMap
public class GetKeys_6th {
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
	System.out.println(hs.keySet());

}
}
