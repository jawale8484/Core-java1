package com.hefshine.Array_HW;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		System.out.println("Enter element in array");
		int arry[] = new int[size];
		for (i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
		}

		System.out.println("Enter the size of array");
		int size1 = sc.nextInt();

		System.out.println("Enter element in array");
		int arry1[] = new int[size1];
		for (i = 0; i < size1; i++) {
			arry1[i] = sc.nextInt();
		}
		int size3=size+size1;
		int merge[]=new int[size3];
		int count=0;
		for (i=0;i<size;i++)
			{			
				merge[i]=arry[i];
				count++;
			//System.out.print(merge[i]+"\t");
			}
		for(int j=0;j<size1;j++) {
			merge[count++]=arry1[j];
			
		}
		System.out.println("merged array");
	for ( i=0;i<size3;i++) {
		System.out.print(merge[i]+"\t");
	}
	System.out.println();
	}
	}


 