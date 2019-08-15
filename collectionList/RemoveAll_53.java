package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//53.	WAP to remove all elements from ArrayList
public class RemoveAll_53 {
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
	System.out.println("Before removing all element.list is "+al);
	al.removeAll(al);
	System.out.println("After removing all element.list is ");
	
	}
}
