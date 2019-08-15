package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//39.	WAP to iterate through all elements in an ArrayList using for each
public class IteratAndForEach {
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
	Iterator itr=al1.iterator();
	System.out.println("Elements presents in Arraylist");
	for(Object ob: al1) {
		System.out.println(ob);
	}
	
	
}
}
