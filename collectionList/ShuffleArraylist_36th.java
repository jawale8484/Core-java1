package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//36.	WAP to shuffle elements in an ArrayList
public class ShuffleArraylist_36th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity of arraylist");

		int initialcapacity = sc.nextInt();

		ArrayList al1 = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			al1.add(a);
		}
		System.out.println("elements preasents in arraylist");
		Collections.shuffle(al1);
		System.out.println("after shuffle the elements are " + al1);
	}
}
