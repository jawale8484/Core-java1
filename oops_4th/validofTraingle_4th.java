package com.hef.oops_4th;

import java.util.Scanner;

public class validofTraingle_4th {
	Scanner sc = new Scanner(System.in);

	void Chk_triangle() {

		System.out.println("Enter 1st side of triangle");
		int a1 = sc.nextInt();

		System.out.println("ENter Second side of traingle");
		int a2 = sc.nextInt();

		System.out.println("Enter thrd side of triangle");
		int a3 = sc.nextInt();

		int a4 = a1 + a2 + a3;
		if (a4 == 180) {
			System.out.println("Triangle is valid");

		} else
			System.out.println("Triangle is not vaid");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		validofTraingle_4th ob= new validofTraingle_4th();
		ob.Chk_triangle();
	
	}

}