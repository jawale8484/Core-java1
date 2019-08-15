package com.hef.loops_HW3rd;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the terms u want to print");
	int a=sc.nextInt();
	for (int i=0;i<a;i++) {
		for (int j=0;j<=i;j++) {
			System.out.print("* ");
	
	
		}
			System.out.println();
	}
	}

}

