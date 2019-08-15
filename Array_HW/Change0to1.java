package com.hefshine.Array_HW;

import java.util.Scanner;

//17.WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].
import com.hefshine.Array_HW.Getarray.*;

public class Change0to1 {

	public static void main(String[] args) {

		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=Sc.nextInt();
				
		int []array=Getarray.getIntArrayOfSize(size);			//this method  will input array

		for(int i=0;i<size;i++) {
			if(array[i]==0) {
				array[i]=1;
		
			}
			}
		
	Getarray.DisplayIntArray(array);						//this method will display array
	}
		
		
		}

// Getarray.DisplayIntArray(numbers);




