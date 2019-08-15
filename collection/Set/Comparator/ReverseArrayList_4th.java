package com.hefshine.collection.Set.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//4.	Reverse an arraylist of 10 integers.
public class ReverseArrayList_4th {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("Enter element in arraylist");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			al.add(sc.nextInt());
		}
		System.out.println("normal arraylist is "+al);
	System.out.println("reversing arraylist...");
	Collections.reverse(al);
	System.out.println("Reversed arraylist "+al);
	}
}
