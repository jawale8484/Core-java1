package com.hefshine.Array_HW;

import java.util.Scanner;

//9.WAP to print all negative elements in an array and also count total number of negative elements in an array.
public class CountNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter element in array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;

		System.out.println("negative numbers are");
		for (int i = 0; i < size; i++) {
			if (a[i] < 0) {
				// System.out.print(a[i]);
					count++;

			}
		}
		System.out.println("total negative numbers are " + count);

	}

}

/*
int temp=array[i];
	array[i]=array[size-i-1];
	array[size-i-1]=temp;
		

*/