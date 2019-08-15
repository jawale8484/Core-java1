package com.hefshine.collectionList;
//34.	WAP to remove first and last element from a linked list.

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveFirstAndLast_34th {

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
	System.out.println("elements in linkedlist"+llist);
		llist.removeFirst();
		System.out.println("remaining elememnts after removal first element in linkedlist"+llist);
		llist.removeLast();
		System.out.println("remaining element after removal last element in linkedlist"+llist);
	}
}