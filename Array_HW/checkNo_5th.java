package com.hefshine.Array_HW;

import java.util.Scanner;
/*5.	Take 10 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
*/

public class checkNo_5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int i = 0;
		System.out.println("Enter 10 element in array");
		for (i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("\npositive numbers are ");
	for (i=0;i < 10; i++) {
		if(array[i]>0) {
		System.out.print(array[i]+" ");	
		}
	}
	
	System.out.println("\nnegative numbers are ");
	for (i=0;i < 10; i++) {
		if(array[i]<0) {
		System.out.println(array[i]+"  ");	
		}
	}
	System.out.println("\neven numbers");
	for(i=0;i<10;i++) {
		if (array[i]%2==0) {
		System.out.print(array[i]+" ");	
		}
	}
	System.out.println("\n odd numbers are");
	for(i=0;i<10;i++) {
		if (array[i]%2!=0) {
		System.out.print(array[i]+" ");	
		}
	}
	
	
	
	}

	
	
}
	
