package com.hefshine.collection.Set;

import java.util.Scanner;
import java.util.TreeSet;

//7.	WAP to get the first and last elements in a TreeSet.
public class GetFirstAndLastElement_7th {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TreeSet ts = new TreeSet();
		System.out.println("Enter the object in treeset");
		
		for(int i=0;i<5;i++) {
			Object o=sc.next();
			ts.add(o);
		}
		System.out.println("Tree set elements are "+ts);
		System.out.println("This is the First element in Treeset := "+ts.first());
		System.out.println("This is the last element in Treeset := "+ts.last());
		
		
	}
}
