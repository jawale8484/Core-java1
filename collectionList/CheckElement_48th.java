package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//48.	WAP to check if a particular element exists in a linked list.
public class CheckElement_48th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("llinked list is "+llist);
	System.out.println("Enter the element to check ");
	String chkelement=sc.next();
	System.out.println("Is that element present in list or not??"+llist.contains(chkelement));
	
	
	}
}
