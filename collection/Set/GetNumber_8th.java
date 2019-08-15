package com.hefshine.collection.Set;

import java.util.Scanner;
import java.util.TreeSet;

//8.	WAP to get the number of elements in a TreeSet.
public class GetNumber_8th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of treeset");
		int size = sc.nextInt();
		TreeSet ts = new TreeSet();
		System.out.println("Enter the object in treeset");

		for (int i = 0; i < size; i++) {
			Object o = sc.next();
			ts.add(o);
		}
		System.out.println("elements in treeset is "+ts);
		System.out.println("Number of element in treeset is = "+ts.size());

	}
}