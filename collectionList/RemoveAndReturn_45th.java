package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//45.	WAP to remove and return the first element of a linked list.
public class RemoveAndReturn_45th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("Before removing element "+llist);
		System.out.println("Enter the elemenet to remove");
		String removeelement = sc.next();
		
		llist.remove(removeelement);
	
		System.out.println("After removing "+removeelement+" element linklist is "+llist);
		System.out.println("removed element is "+removeelement);
	}
}
