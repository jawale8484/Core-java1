package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//29.	WAP to insert the specified element at the end of a linked list.
public class InsertLast_29th {
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
	System.out.println("Enter element for add");
	Object element=sc.next();
llist.addLast(element);
System.out.println("Updated link list is "+llist);


}
}
