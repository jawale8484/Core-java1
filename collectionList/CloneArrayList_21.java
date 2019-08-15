package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//21.	WAP to clone an ArrayList to another ArrayList
public class CloneArrayList_21 {
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
System.out.println("First arraylist is "+al1);
		ArrayList al2 = new ArrayList();
		al2 = (ArrayList) al1.clone();

		System.out.println("Cloned Arraylist is " + al2);	
	}
}
