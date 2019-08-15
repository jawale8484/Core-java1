package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//14.WAP to iterate through all elements in a linked list starting at the specified position.
public class StartingIterator_14th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity of arraylist");

		int initialcapacity = sc.nextInt();

		ArrayList al = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			al.add(a);
		}
		System.out.println("Enter a position to print from that");
		int position = sc.nextInt();
		Iterator itr = al.listIterator(position);
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
