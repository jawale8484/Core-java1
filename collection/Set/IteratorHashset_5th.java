package com.hefshine.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//5.	WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.
public class IteratorHashset_5th {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		System.out.println("Enter element in hashset");
for(int i=0;i<5;i++) {
	hs.add(sc.next());
}
System.out.println("using iterator printing values ");
	Iterator itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("In hashset values are stores by hashtable \n hence stored in hashtable format");
	}
}
