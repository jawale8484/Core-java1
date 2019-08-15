package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Scanner;

//12.	WAP to test if a HashSet is empty or not.
public class Isempty_12th {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("enter the element in set");
		HashSet hs = new HashSet();
		for (int i = 0; i < 5; i++) {
			hs.add(sc.next());
		}
hs.clear();
System.out.println("updated set is "+hs);
	System.out.println("Treeset is empty or not?? "+hs.isEmpty());
	
	}

}
