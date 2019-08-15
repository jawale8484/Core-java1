package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//26.	WAP to remove the third element from an ArrayList
public class RemoveElement_26th {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	ArrayList al1 = new ArrayList(5);
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 5; i++) {
		String a = sc.next();
		al1.add(a);
	}
System.out.println("Enter element to remove");
Object removeelement=sc.next();
al1.remove(removeelement);
System.out.println(al1);
}
}
