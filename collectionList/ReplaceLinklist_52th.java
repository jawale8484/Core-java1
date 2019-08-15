package com.hefshine.collectionList;
//52.	WAP to replace an element in a linked list

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReplaceLinklist_52th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		System.out.println("Enter element to replace ");
		String remove=sc.next();
		System.out.println("Enter element to place at that position");
		String place=sc.next();
		System.out.println("Before replacing element list is "+llist);
		Collections.replaceAll(llist, remove, place);
		System.out.println("After replacing element updated list is "+llist);
	
	}
}