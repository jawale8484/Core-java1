package com.hefshine.collectionList;

import java.util.ArrayList;
import java.util.Scanner;

//56.	WAP to test an ArrayList is empty or not
public class Isempty_56 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList al = new ArrayList();
	System.out.println("enter the element in arraylist");
	for (int i = 0; i < 3; i++) {
		String a = sc.next();
		al.add(a);
	}
	System.out.println("Elements in arraylist "+al);
	System.out.println("check wheather any element in arraylist or not?? "+al.isEmpty());
}

}
