package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//51.	WAP to test a linked list is empty or not.
public class IsEmpty_51 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	LinkedList llist = new LinkedList();
	System.out.println("Enter the element in first linklist");
	for (int i = 0; i < 3; i++) {
		llist.add(sc.next());
	}
System.out.println("Is there list empty or not?? "+llist.isEmpty());
}
}
