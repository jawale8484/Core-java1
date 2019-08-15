package com.hefshine.collectionMap;

import java.util.Scanner;
import java.util.TreeMap;

//12.	WAP to create a TreeMap with Integer as key and get a key-value mapping associated with the 
//		greatest key and the least key in a map
public class Treemap_12th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer,String> ts = new TreeMap<Integer,String>();
		ts.put(1, "aaa");
		ts.put(2, "bbb");
		ts.put(3, "ccc");
		ts.put(4, "ddd");
		ts.put(5, "eee");
		
		System.out.println(ts);
		
		System.out.println("This is the greatest key in map=="+ts.lastKey());
		System.out.println("This is the least key in map=="+ts.firstKey());
	}
}
