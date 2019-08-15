package com.hefshine.collectionList;

import java.util.LinkedList;
import java.util.Scanner;

//32.	WAP to display the elements and their positions in a linked list.
public class PositionAndIndex_32th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		System.out.println("Enter the size of arraylist");
		int size = sc.nextInt();
		System.out.println("Enter the element in arraylist");
		for (int i = 0; i < size; i++) {
			String element = sc.next();
			llist.add(element);
		}
		for(int i=0;i<size;i++) {
		System.out.println(llist.get(i)+ " Element is at "+i);
		
		}
	}
}
