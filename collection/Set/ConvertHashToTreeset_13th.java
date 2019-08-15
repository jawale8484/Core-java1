package com.hefshine.collection.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

//13.WAP to create a TreeSet from a HashSet.
public class ConvertHashToTreeset_13th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element in set");
		HashSet hs = new HashSet();
		for (int i = 0; i < 5; i++) {
			hs.add(sc.next());
		}
		System.out.println("This elements present in hashset :-\n"+hs);
		System.out.println("Converting elements in Treeset...");
		TreeSet ts=new TreeSet(hs);
		
		
		System.out.println("These elements from Treeset:-\n"+ts);
	}
}