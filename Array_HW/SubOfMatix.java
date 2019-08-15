package com.hefshine.Array_HW;

import java.util.Scanner;

//20.	WAP to subtract two matrices.
public class SubOfMatix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of matrix");
		int rows=sc.nextInt();
		System.out.println("Enter the colms of matrix");
		int colms=sc.nextInt();

		int arry1[][]=new int [rows][colms];
		int arry2[][]=new int [rows][colms];
		int arry3[][]=new int [rows][colms];
			System.out.println("Enter the element in first matrix");
			for (int i=0;i<rows;i++) {
				for(int j=0;j<colms;j++) {
					arry1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter element in 2nd matrix");
			for (int i=0;i<rows;i++) {
				for(int j=0;j<colms;j++) {
					arry2[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<rows;i++) {					//Substraction
				for(int j=0;j<colms;j++) {
					arry3[i][j]=arry1[i][j]-arry2[i][j];
				}
					
			}
			
			for (int i=0;i<rows;i++) {
				for(int j=0;j<colms;j++) {
					System.out.print(" "+arry3[i][j]);
				}
				System.out.println();
			}
			
	}

}
