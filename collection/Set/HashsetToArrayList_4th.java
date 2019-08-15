package com.hefshine.collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//4.	WAP to create a HashSet from an ArrayList
public class HashsetToArrayList_4th {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		System.out.println("Enter element in hashset");
for(int i=0;i<5;i++) {
	hs.add(sc.next());
}
System.out.println("hashset elements are "+hs);
System.out.println("Converting hashset to arraylist...");
	ArrayList al=new ArrayList(hs);
	System.out.println("arraylist elements are"+al);
	}
}
