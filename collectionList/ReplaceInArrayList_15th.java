package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//15.	WAP to replace the second element of an ArrayList with the specified element
public class ReplaceInArrayList_15th {
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

		System.out.println("Enter the position to change");
		int pos=sc.nextInt();
		System.out.println("Enter the object to replace over there");
		Object newOb=sc.next();
		al.set(pos, newOb);
	System.out.println("Updated list is "+al);
	}
}
