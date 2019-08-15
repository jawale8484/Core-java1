package com.hefshine.Array_HW;

import java.util.Scanner;

//get input 
public class Getarray {
	
	public static int[] getIntArrayOfSize(int size) {
		
		Scanner scanner=new Scanner(System.in);
		
		int array[]=new int[size];
		System.out.println("Enter "+size+" array element");
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		return array;
		
	}

public static void DisplayIntArray(int []array ) {
	System.out.println("You entered ");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
}
}