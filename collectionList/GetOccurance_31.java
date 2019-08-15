package com.hefshine.collectionList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//31.	WAP to get the first and last occurrence of the specified elements in a linked list
public class GetOccurance_31 {
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
		System.out.println("Enter element to get occurance");
		Object element = sc.next();
		System.out.println("It get first index " + llist.indexOf(element));
		System.out.println("last index is " + llist.lastIndexOf(element));

	}

}
