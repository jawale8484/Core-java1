package com.hef.loops_HW3rd;

import java.util.Scanner;

/*
 * 10.	WAP to print following Pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
public class Pattern_10th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" " + j);
			}
		
		System.out.println();
		}
	}

}
