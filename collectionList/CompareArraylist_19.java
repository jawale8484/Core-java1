package com.hefshine.collectionList;
//19.	WAP to compare two ArrayLists print if equal?

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompareArraylist_19 {
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
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			al2.add(a);
		}
	if(al1.containsAll(al2)) {
		System.out.println("Both arraylists are same");
	}else {
		System.out.println("Arraylist are diffrent");
	}
		
		
		
	}
}