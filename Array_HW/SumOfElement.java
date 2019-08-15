package com.hefshine.Array_HW;

import java.util.Scanner;

//10.Write a Java program to find sum of elements of an array.
public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int i = 0;
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter element in array");
		int arry[] = new int[size];
		for (int i = 0; i < size; i++) {
			arry[i] = sc.nextInt();

		}
		System.out.println("Entered Elements are ");
		
		for (int i = 0; i < size; i++) {
			System.out.println(arry[i]);

		}
int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arry[i];
			
		}		
		System.out.println("sum of all element is "+sum);
		
		
		
	}

}
