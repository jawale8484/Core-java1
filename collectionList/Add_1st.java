package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_1st {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the capacity of arraylist");
			
			int initialcapacity=sc.nextInt();

			ArrayList al=new ArrayList();		
		System.out.println("enter the element in arraylist");
		for(int i=0;i<initialcapacity;i++) {
		String a=sc.next();
		al.add(a);
		}
		al.add("Added");
		System.out.println(al);
		}

	}

