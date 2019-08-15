package com.hefshine.Array_HW;

import java.util.Scanner;

//12.WAP to find the maximum and minimum value in an array.
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the element in array");
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("minimum number");
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < size; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		System.out.println("minimum number from array is " + min);
		System.out.println("maximum number from array is " + max);
	}
}