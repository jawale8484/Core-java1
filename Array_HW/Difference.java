package com.hefshine.Array_HW;

import java.util.Scanner;

//18.	Write a Java program to get the 
//difference between the largest and smallest values in an array of integers.
//The length of the array must be 1 and above
public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int array[] = Getarray.getIntArrayOfSize(size); // this method will input array

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (array[i] > array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}
		}
		int min = array[0];
		System.out.println("Smallest number is " + min);
		int lastelement = size - 1;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int max = array[lastelement];
		System.out.println("maximum number from array " + max);
		int diff = 0;
		for (int i = 0; i < size; i++) {
			diff = max - min;
		}
		System.out.println("diffrence between max and min is " + diff);
	}

}
