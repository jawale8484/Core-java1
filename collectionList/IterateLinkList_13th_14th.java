package com.hefshine.collectionList;
//13.	WAP to iterate through all elements in a linked list.
//14.	WAP to iterate through all elements in a linked list starting at the specified position.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IterateLinkList_13th_14th {
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
		Iterator itr = llist.iterator();
		System.out.println("Printing using Iterator");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	
	
	}
}