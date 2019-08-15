package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//28.	WAP to insert the specified element at the front of a linked list.
public class InsertInLinklist_28th {
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
	System.out.println("before insertion"+llist);

	System.out.println("Enter the element to insert");
	Object element=sc.next();
llist.addFirst(element);
System.out.println("after insertion "+llist);
}
}
