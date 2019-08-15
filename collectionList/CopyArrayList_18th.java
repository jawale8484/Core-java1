package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//18.	WAP to copy one ArrayList into another
public class CopyArrayList_18th {
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
	ArrayList al2 = new ArrayList();
al2.addAll(al);
System.out.println("In array list 1 "+al);
System.out.println("In arrayllist 2 \n"+al2);
}
}
