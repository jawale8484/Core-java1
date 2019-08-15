package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//55.	WAP to know how many elements in ArrayList
public class Size_55th {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList al = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 3; i++) {
		String a = sc.next();
		al.add(a);
	}
	System.out.println("Elements in arraylist "+al);
	System.out.println("how many elements in arraylist "+al.size());
}
}
