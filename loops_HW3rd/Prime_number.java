package com.hef.loops_HW3rd;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number you want to check:");
		int a = sc.nextInt();
		boolean x = false;
		for (int i = 2; i <a ; i++) {

			if (a % i == 0) {
				x = false;
break;
			} else {
				x = true;
			}
		}
if(x==true)
	System.out.println("prime");
else System.out.println("not prime");
	}
}
