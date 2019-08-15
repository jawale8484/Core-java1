package com.hefshine.Array_HW;

//1.	WAP to create 1D array and accept data in that array. Calculate the average value of array elements.
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter array element");
		int sum=0;
		int arry[] = new int[size];
		for (int i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
			
			sum=sum+arry[i];
		
		}
		System.out.println("Sum of array is "+sum);
		int avg=sum/size;
		System.out.println("average of given numbers "+avg);
		
	}

}
