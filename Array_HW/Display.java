package com.hefshine.Array_HW;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();


System.out.println("Enter element in array");
int array[]=new int[size];

	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
		
	}
	System.out.println("You have entered ");
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+"\t");
	}
	
	}

}
