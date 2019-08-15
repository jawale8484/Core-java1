package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//5.	WAP to clear all objects from ArrayList.
public class RemoveAll_5th {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the capacity of arraylist");

	int initialcapacity = sc.nextInt();

	ArrayList al = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < initialcapacity; i++) {
		String a = sc.next();
		al.add(a);
	}
	System.out.println("before deleting \n"+al);
al.removeAll(al);						//it remove all element from al collection
System.out.println("after deleting \n"+al);
}
}
