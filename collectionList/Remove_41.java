package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//41.	WAP to remove element from ArrayList
public class Remove_41 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the capacity of arraylist");

	int initialcapacity = sc.nextInt();

	ArrayList al1 = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < initialcapacity; i++) {
		String a = sc.next();
		al1.add(a);
	}
	System.out.println("Enter the element to remove");
	Object o=sc.next();
	System.out.println("Before remove"+al1);
	al1.remove(o);
	System.out.println("After removing element "+al1);
}
}
