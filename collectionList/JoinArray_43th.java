package com.hefshine.collectionList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//43.	WAP to join two linked lists.
public class JoinArray_43th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("Enter element in 2nd linklist ");
		LinkedList llist1 = new LinkedList();
		for (int i = 0; i < 3; i++) {
			llist1.add(sc.next());
		}
		llist.addAll(llist1);
		
		System.out.println("Joined linklist is "+llist);
		
	}
}
