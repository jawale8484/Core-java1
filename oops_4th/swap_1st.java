package com.hef.oops_4th;

import java.util.Scanner;

public class swap_1st {
	Scanner sc = new Scanner(System.in);

	void Swap() {
		System.out.println("Enter 1st number");
		int a1 = sc.nextInt();

		System.out.println("Enter 2nd number");
		int a2 = sc.nextInt();

		int temp = 0;
		temp = a1;
		a1 = a2;
		a2 = temp;

		System.out.println("updated value of 1st no is"+a1);
		System.out.println("Updated value of 2nd no is"+a2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap_1st ob = new swap_1st();
		ob.Swap();

	}

}
