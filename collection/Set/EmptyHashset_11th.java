package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Scanner;

//11.	WAP to empty a HashSet.
public class EmptyHashset_11th {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("enter the element in set");
		HashSet hs = new HashSet();
		for (int i = 0; i < 5; i++) {
			hs.add(sc.next());
		}
hs.clear();
System.out.println("updated set is "+hs);
	}
}
