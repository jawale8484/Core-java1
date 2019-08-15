package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//2.	WAP to Remove an element in an ArrayList
public class Remove_2nd {
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
	System.out.println("Before deleting "+al);
al.remove(2);
System.out.println("After Delet"+al);
	}


}
