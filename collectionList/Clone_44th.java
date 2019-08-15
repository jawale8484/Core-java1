package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//44.	WAP to clone a linked list to another linked list.
public class Clone_44th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("main linklist is "+llist);
		LinkedList llistcloned = new LinkedList();
		System.out.println("Clonning linklist...");
		llistcloned=(LinkedList) llist.clone();
	System.out.println("Cloned linklist is "+llistcloned);
	}
}
