package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//11.	WAP of swap two elements in an ArrayList
public class SwapInArraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter the size of arraylist");
		int size = sc.nextInt();
		System.out.println("Enter the element in arraylist");
		for (int i = 0; i < size; i++) {
			String element = sc.next();
			al.add(element);
		}
		System.out.println("Enter 1st number to swap");
		int frstno = sc.nextInt();
		System.out.println("Enter another no for swapping ");
		int anotherno = sc.nextInt();
		Collections.swap(al, frstno, anotherno);				//this method swap element for given index
				
		System.out.println(al);
	}
}
