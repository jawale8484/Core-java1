package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//12.WAP to append the specified element to the end of a linked list.
public class AppendInLinkList_12th {
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
		System.out.println("Enter the index where you want to add element");
		int index=sc.nextInt();
		System.out.println("Enter the Element you want to add at "+index+" this index");
		Object element=sc.next();
		llist.add(index, element);
		System.out.println(llist);
	}
}
