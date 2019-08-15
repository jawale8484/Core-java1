package com.hefshine.collectionList;
//54.	WAP to retain all elements from ArrayList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Retainall_54th {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList al = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < 3; i++) {
			String a = sc.next();
			al.add(a);
		}
		LinkedList llist = new LinkedList();
		System.out.println("Enter the element in first linklist");
		for (int i = 0; i < 3; i++) {
			llist.add(sc.next());
		}
		
	System.out.println(al.retainAll(llist));	//return true if values are diff from another collection
	}
}