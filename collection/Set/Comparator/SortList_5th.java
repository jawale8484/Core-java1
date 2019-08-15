package com.hefshine.collection.Set.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//5.	WAP to sort the elements of List that contains String objects.PrintArrayList.Sort using Collections.
//		sort(list) method
public class SortList_5th {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Enter String element in arraylist");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			al.add(sc.next());
			}
		System.out.println("normal arraylist is " + al);
		System.out.println("Sorting arraylist...");
		Collections.sort(al);
		System.out.println("sorted arraylist is " + al);
		
	}
}
