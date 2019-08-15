package com.hefshine.collectionList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//42.	WAP to shuffle the elements in a linked list
public class ShuffleLinklist_42 {
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
	System.out.println("before shuffling linklist is "+llist);
	Collections.shuffle(llist);
	System.out.println("after shuffling linklist is "+llist);

}
}
