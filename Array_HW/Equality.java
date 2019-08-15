package com.hefshine.Array_HW;

//14.	Write a Java program to test the equality of two arrays.
import java.util.Scanner;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size1 = sc.nextInt();
		int array1[] = new int[size1];

		System.out.println("enter elements in array");
		for (int i = 0; i < size1; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int size2 = sc.nextInt();
		int array2[] = new int[size2];
		System.out.println("Enter the elements in 2nd array");
		for (int j = 0; j < size2; j++) {
			array2[j] = sc.nextInt();
		}
		boolean t = true;

		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if (array1[i] == array2[j]) {
					t = true;
				} else
					t = false;
			}
		}
		if (t == true) {
			System.out.println("both array are same");
		} else if (t == false) {
			System.out.println("both array are not same");
		}
	}

}
