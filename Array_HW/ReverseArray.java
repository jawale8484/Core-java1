package com.hefshine.Array_HW;

import java.util.Scanner;

//16.	WAP to reverse the array itself. {Hint- arr[] = [3, 90, 45, 29, 37, 78] 
//so your same array must be [78, 37, 29, 45, 90, 3]} without using temporary array.  
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();
int array[]=new int [size];
System.out.println("Enter the element in array");
for (int i=0;i<size;i++) {
	array[i]=sc.nextInt();
	
} 
System.out.println("you entered elements ");
for(int i=0;i<size;i++) {
	System.out.print(array[i]+" ");
}
int count=0;
int mid_pt=size/2;
System.out.println();
System.out.println("Reversed array is ");
for(int i=0;i<mid_pt;i++) {
	int temp=array[i];
	array[i]=array[size-i-1];
	array[size-i-1]=temp;
		

}
for(int i=0;i<size;i++) {
	System.out.print(array[i]+" ");
}
	}

}
