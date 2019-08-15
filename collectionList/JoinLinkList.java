package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//43.	WAP to join two linked lists.
public class JoinLinkList {
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
	
		LinkedList llist2 = new LinkedList();
		System.out.println("Enter the size of arraylist");
		int size2 = sc.nextInt();
		System.out.println("Enter the element in arraylist");
		for (int i = 0; i < size2; i++) {
			String element = sc.next();
			llist2.add(element);
		}
	
	}
}
