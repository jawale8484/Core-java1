package com.hefshine.collection.Set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//14.	WAP to create a new TreeSet, add Strings and print the TreeSet.
public class StringTreeset_14th {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet ts=new TreeSet();
		System.out.println("Enter the strings element in treeset : ");
		for(int i=0;i<5;i++) {
			
			ts.add(sc.next());
		}
		Iterator itr=ts.iterator();
		System.out.println("This is the element in treeset");
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		
		}
}
