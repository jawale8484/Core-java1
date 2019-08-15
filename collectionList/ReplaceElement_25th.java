package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//25.	WAP to update specific array element by given element
public class ReplaceElement_25th {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	ArrayList al1 = new ArrayList(5);
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 5; i++) {
		String a = sc.next();
		al1.add(a);
	}
	System.out.println("Enter old value to change");
	Object oldVal=sc.next();
	System.out.println("Enter new vlaue to change");
	Object newVal=sc.next();
	Collections.replaceAll(al1, oldVal, newVal);
	System.out.println(al1);
}
}
