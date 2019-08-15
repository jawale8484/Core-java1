package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Iterator;

//40.	WAP to create a new ArrayList, add some colors (string) and print the collection.
public class ColorsArraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("blue");
	al.add("black");
	al.add("pink");
	al.add("green");
	al.add("red");
	al.add("yellow");
	al.add("white");
		
	
	Iterator itr=al.iterator();
System.out.println("Colors present in collection");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
