package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//33.	WAP to remove a specified element from a linked list.
public class RemoveFromLinklist_33th {
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
		System.out.println("Enter index for remove");
		int index=sc.nextInt();
		llist.remove(index);
		System.out.println("Remaining elements in linkedlist is "+llist);
	}
}
