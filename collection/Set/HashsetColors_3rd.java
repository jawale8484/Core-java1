package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//3.	WAP to create a HashSet with some colors (String) 
public class HashsetColors_3rd {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the colors in hashset");
		HashSet hs=new HashSet();
		for(int i=0;i<5;i++) {
			hs.add(sc.next());
		}
	Iterator itr=hs.iterator();
	System.out.println("Colors in hashset are");		//it stored in hashtable
														//so it print by hashtable order
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
System.out.println("it stored in hashtable so it print by hashtable order");
	}
}
