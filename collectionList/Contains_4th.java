package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contains_4th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity of arraylist");

		int initialcapacity = sc.nextInt();

		ArrayList al = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			al.add(a);
		}
		System.out.println(al);
System.out.println("ENter element to check");
String o=sc.next();
		System.out.println(al.contains(o));
	}
}
