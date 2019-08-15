package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//3.	WAP to check if the ArrayList is empty or not.
public class IsEmpty_3rd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the capacity of arraylist");
		
		int initialcapacity=sc.nextInt();

		ArrayList al=new ArrayList();		
	System.out.println("enter the element in arraylist");
	for(int i=0;i<initialcapacity;i++) {
	String a=sc.next();
	al.add(a);
	}
	System.out.println(al);

	System.out.println("Arraylist is empty or not? "+al.isEmpty());
}
}