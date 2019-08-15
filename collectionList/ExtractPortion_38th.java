package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//38.	WAP to extract a portion of an ArrayList
public class ExtractPortion_38th {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the capacity of arraylist");

	int initialcapacity = sc.nextInt();
	
	ArrayList al1 = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i <=initialcapacity; i++) {
		String a = sc.next();
		al1.add(a);
	}
	System.out.println(al1);
Object o=al1.subList(2, 4);
al1.remove(o);
System.out.println(al1);
}
}
