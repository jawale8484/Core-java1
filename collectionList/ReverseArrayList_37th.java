package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//37.	WAP to reverse elements in an ArrayList
public class ReverseArrayList_37th {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the capacity of arraylist");

	int initialcapacity = sc.nextInt();

	ArrayList al1 = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i <=initialcapacity; i++) {
		String a = sc.next();
		al1.add(a);
	}
System.out.println("Before reversing elemets are "+al1);
	System.out.println("Reverse elements are ");
	for(int i=initialcapacity;i>=0;i--) {
		System.out.println(al1.get(i));
	}
}
}
