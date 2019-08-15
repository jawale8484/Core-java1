package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//35.	WAP to remove all the elements from a linked list.
public class Removeall_35th {
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
		System.out.println("elements in linklist" + llist);
		llist.removeAll(llist);
		System.out.println("After removing remaing elements are " + llist);
	}
}
