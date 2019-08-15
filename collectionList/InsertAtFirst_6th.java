package com.hefshine.collectionList;
//6.	WAP to insert an element into the ArrayList at the first position

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtFirst_6th {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity of arraylist");

		int initialcapacity = sc.nextInt();

		ArrayList al = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			al.add(a);
		}
		System.out.println("Before add element"+al);
		al.add(0, "newAdded");
		System.out.println("After add element"+al);
		
	}
}