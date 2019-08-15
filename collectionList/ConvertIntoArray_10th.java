package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//10.	WAP to convert collection into array
public class ConvertIntoArray_10th {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter the size of arraylist");
		int size = sc.nextInt();
		System.out.println("Enter the element in arraylist");
		for (int i = 0; i < size; i++) {
			String element = sc.next();
			al.add(element);
		}

		Object objarray[]=al.toArray();			//it convert the collection into array
		int length=objarray.length;
		System.out.println("Converting into array...");

		for(int i=0;i<length;i++) {
			System.out.print(objarray[i]+" ");
		}
	System.out.println();
	}
}
