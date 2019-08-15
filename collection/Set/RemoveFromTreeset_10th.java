package com.hefshine.collection.Set;

import java.util.Scanner;
import java.util.TreeSet;

//10.	WAP to remove a given element from a TreeSet.
public class RemoveFromTreeset_10th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet();
		System.out.println("Enter the object in treeset");
		for (int i = 0; i < 3; i++) {

			ts.add(sc.next());
		}
		System.out.println("Enter the object you want to delete");
		String o = sc.next();
		ts.remove(o);
		System.out.println("Updated set is " + ts);

	}
}
