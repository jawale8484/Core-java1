package com.hefshine.collectionMap;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

//11.	WAP to sort keys in TreeMap by using comparator
class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 < i2) {
			return -1;

		}
		if (i1 > i2) {
			return +1;
		} else
			return 0;

	}

}

public class SortTreeComparator_11th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap ts = new TreeMap(new Mycomparator());
		int key;
		String value;
		System.out.println("ENter the key and value in treemap");
		for (int i = 0; i < 5; i++) {
			key = sc.nextInt();
			value = sc.next();
			ts.put(key, value);

		}
		System.out.println(ts);

	}
}
