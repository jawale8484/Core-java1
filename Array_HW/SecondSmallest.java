package com.hefshine.Array_HW;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int len=sc.nextInt();
		int arr[]=new int [len];
		System.out.println("Enter the element of array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
	
	for(int j=0;j<len;j++)
	{ 
		for( int i=1;i<(len-j);i++)
		{
			if(arr[i-1]>arr[i])
			{
				int temp;
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
		}
		
		}	
	
	
}System.out.println("2nd Smallest Value: "+arr[1]);
}	}
	
	

