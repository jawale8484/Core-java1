package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//20.	WAP to join two ArrayLists
public class JoinArray_20 {
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
		ArrayList al2 = new ArrayList();
		System.out.println("Enter the size of second array");
		int size=sc.nextInt();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < size; i++) {
			String a = sc.next();
			al2.add(a);
		}
al1.addAll(al2);
System.out.println("First Arraylist is \n"+al1);
System.out.println("Second Arraylist is \n"+al2);


System.out.println("Joined arraylist is \n"+al1);
	
	}
}
