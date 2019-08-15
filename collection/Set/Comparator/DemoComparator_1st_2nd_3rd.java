package com.hefshine.collection.Set.Comparator;
//1.	What will happen if compare method returns only +1. Show example.

//2.	What will happen if compare method always returns -1. Show example
//3.	What will happen if compare method always returns 0; Show example.

import java.util.Comparator;

import java.util.Scanner;
import java.util.TreeSet;

class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

//		if (i1 < i2) {
//			return -1;
//		}
//		if (i1 > i2) {
//			return +1;
//
//		} 
//		else {
//			return 0;
//		}
		return 0;
		//return +1;
		//return -1;

	}

}

public class DemoComparator_1st_2nd_3rd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet(new Mycomparator());
		System.out.println("Enter the element in treeset");
		for (int i = 0; i < 5; i++) {

			Integer intgr = (Integer) sc.nextInt();
			ts.add(intgr);
		}

		System.out.println("These are the elements in treeset set through comparator \n" + ts);
	}
}
 