package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//27.	WAP to insert elements into the linked list at the first and last position.
public class InsertIntoLinklist_27th {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	LinkedList llist = new LinkedList();
	System.out.println("Enter the size of arraylist");
	int size = sc.nextInt();
	System.out.println("Enter the element in arraylist");
	for (int i = 0; i < size; i++) {
		String element = sc.next();
		llist.add(element);
	}
	System.out.println("Elements before adding"+llist);
llist.addFirst("First");
llist.addLast("Last");
	System.out.println("Linklist elements are "+llist);
}
}
