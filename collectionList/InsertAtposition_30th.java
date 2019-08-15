package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//30.	WAP to insert some elements at the specified position into a linked list.
public class InsertAtposition_30th {
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
	System.out.println("Enter index you want to add element");
int index=sc.nextInt();
System.out.println("Enter element to add");
Object element=sc.next();
llist.add(index, element);
System.out.println("After insertion list is "+llist);
}
}
