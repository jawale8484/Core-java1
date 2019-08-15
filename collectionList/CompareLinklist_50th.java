package com.hefshine.collectionList;
//50.	WAP to compare two linked lists.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CompareLinklist_50th {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}

		LinkedList llist2 = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist2.add(sc.next());
		}
		
		System.out.println("List 1 is :-\n"+llist);
		System.out.println("List 2 is :-\n"+llist2);
		if(llist.containsAll(llist2)) {
			System.out.println("both list are same");
		}else {
			System.out.println("List are not same");
		}
	}
}