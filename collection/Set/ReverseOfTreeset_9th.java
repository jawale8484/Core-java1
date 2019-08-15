package com.hefshine.collection.Set;
//9.	WAP to create a reverse order view of the elements contained in a given TreeSet.

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) o1; // wrapper class
		Integer i2 = (Integer) o2;

		if (i1 > i2) {
			return -1;
		}
		if (i2 > i1) {
			return +1;

		} else {
			return 0;
		}
	}

}

public class ReverseOfTreeset_9th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet(new MyComparator());
		System.out.println("Enter the object in treeset");
//		ts.add(56);
//		ts.add(33);
//		ts.add(34);
		for (int i = 0; i < 3; i++) {
			Integer a = (Integer)sc.nextInt();			//wrap-up integer value in Integer
			ts.add(a);
		}
		System.out.println(ts);
	}

}
