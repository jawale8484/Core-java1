package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//24.	WAP to increase the size of an ArrayList
public class IncreaseSizeOfArray_24th {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	ArrayList al1 = new ArrayList(5);
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 5; i++) {
		String a = sc.next();
		al1.add(a);
	}
	System.out.println(al1);
	System.out.println("you want to insert more element \n Y OR N");
	char ch=sc.next().charAt(0);
	if(ch=='Y'||ch=='y') {
	al1.ensureCapacity(5);
	System.out.println("ENter more element in arraylist");
	for (int i = 5; i < 10; i++) {
		String a = sc.next();
		al1.add(a);
	}}
	System.out.println(al1);
}
}
