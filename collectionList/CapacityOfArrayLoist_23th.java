package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//23.	WAP to trim the capacity of an ArrayList the current list size
public class CapacityOfArrayLoist_23th {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	ArrayList al1 = new ArrayList(10);
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 5; i++) {
		String a = sc.next();
		al1.add(a);
	}
	
	al1.trimToSize();
System.out.println("After trim size"+al1);
}
}
