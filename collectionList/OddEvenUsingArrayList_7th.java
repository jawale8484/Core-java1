package com.hefshine.collectionList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//7.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

public class OddEvenUsingArrayList_7th {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList arraylist=new ArrayList();
		for(int i=0;i<=50;i++) {
			
			arraylist.add(i,i);
			
		}
		Iterator itr =arraylist.iterator();
		System.out.println("Even numbers are \n \n");
		while(itr.hasNext()) {
			Integer integer=(Integer) itr.next();
			if(integer%2==0) {
				System.out.print(integer+" ");
			}
		}
	System.out.println();
	}
}
