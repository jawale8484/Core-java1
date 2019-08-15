package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Scanner;

//6.	WAP to get the number of elements in a HashSet.
public class GetNumberOfelement_6th {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		System.out.println("Enter element in hashset");
for(int i=0;i<5;i++) {
	hs.add(sc.next());
}
System.out.println("Number of elements in hashset :"+hs.size());
	}
}
