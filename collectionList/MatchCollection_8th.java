package com.hefshine.collectionList;

import java.util.ArrayList;
//8.	WAP to match two collections
import java.util.Scanner;

public class MatchCollection_8th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		System.out.println("Enter the element in arraylist");
		for (int i = 0; i < 5; i++) {
			String element=sc.next();
			al.add(element);
		}

		ArrayList al2 = new ArrayList();
		System.out.println("Enter the element in 2nd arraylist");
		for (int i = 0; i < 5; i++) {
			String element2=sc.next();
			al2.add(element2);
		}

		System.out.println("Is there both collection is matching or not=="+al.containsAll(al2));
	}
}
