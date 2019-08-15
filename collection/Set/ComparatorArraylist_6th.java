package com.hefshine.collection.Set;
//6.	Sort arraylist of integers without using sort method.

import java.util.*;

class comperr implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		int i1 = I1;
		int i2 = I2;
		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return +1;
		} else {
			return 0;
		}
	}
}

class ComparatorArraylist_6th {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ComparatorArraylist_6th ob=new ComparatorArraylist_6th();

		ArrayList al = new ArrayList();

		System.out.println("Enter element");

		for (int i = 0; i < 5; i++) {
			Integer a = (Integer) sc.nextInt();
			al.add(a);
		}
		TreeSet ts = new TreeSet(new comperr().reversed());
		ts.addAll(al);

		System.out.println("elements in array list" + ts);
	}
}
