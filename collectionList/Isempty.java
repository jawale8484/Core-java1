package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//3.	WAP to check if collection is empty
public class Isempty {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList al = new ArrayList();
	System.out.println("Enter the size of arraylist");
	int size=sc.nextInt();
	System.out.println("Enter the element in arraylist");
	for (int i = 0; i < size; i++) {
		String element=sc.next();
		al.add(element);
	}
System.out.println("Check wheather element is present in arraylist or not?? "+al.isEmpty());
}
}
