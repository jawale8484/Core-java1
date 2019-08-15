package com.hefshine.Array_HW;

import java.util.Scanner;

//6.WAP to print reverse of an array.
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter array element");
//int sum=0;
		int arry[] = new int[size];
		for (int i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
		}

		System.out.println("normal array");
		for (int i = 0; i < size; i++) {
			System.out.print(arry[i] + " \t");
		}
		System.out.println("reversed array");
		int b[] = new int[size];
		int j = size;
		for (int i = 0; i < size; i++) {

			b[j - 1] = arry[i];
			j = j - 1;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(b[i]+"\t");
		}
	}

}
