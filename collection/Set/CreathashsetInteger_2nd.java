package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Scanner;

//2.	WAP to create a HashSet with Integer objects without using generics
public class CreathashsetInteger_2nd {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value in hashset");
		for(int i=0;i<4;i++) {
			hs.add(sc.nextInt());
		}
	System.out.println("elements from hashset"+hs);
	}
}
