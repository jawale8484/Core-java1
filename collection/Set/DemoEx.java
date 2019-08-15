package com.hefshine.collection.Set;

import java.util.Scanner;
import java.util.TreeSet;

public class DemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new  Scanner(System.in);
TreeSet t = new TreeSet();
System.out.println("enter elements : ");
for(int i=0;i<5;i++) {
	t.add(sc.next());
}
System.out.println(t);
	}


}
