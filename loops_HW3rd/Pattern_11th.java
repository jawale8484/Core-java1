package com.hef.loops_HW3rd;

import java.util.Scanner;

public class Pattern_11th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number u want to print");
int a=sc.nextInt();
for (int i=1;i>=a;i++) {
	for (int j=i;j>=i;j++)
		System.out.print(" number"+i);
}
System.out.println();

	}

}
