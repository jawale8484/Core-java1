package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//49.	WAP to convert a linked list to array list.
public class ConvertArrayListToLinkedlist_49th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("Linkedlist elements are "+llist );
		System.out.println("Converting linklist into arraylist...");
		ArrayList al=new ArrayList(llist);
		System.out.println("Converted arraylist is "+al);
	}
}
