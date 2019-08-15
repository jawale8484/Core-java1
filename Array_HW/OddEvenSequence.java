package com.hefshine.Array_HW;

import java.util.Scanner;

public class OddEvenSequence {
//19.	Write a Java program to separate even and odd numbers of an given array of integers.
//Put all even numbers first, and then odd numbers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();
int array[] = Getarray.getIntArrayOfSize(size); // this method will input array
int x=0;
int New[]=new int[size];
for(int i=0;i<size;i++) {
	if(array[i]%2==0) {
		New[x]=array[i];
		
		x++;
		}
}

for(int i=0;i<size;i++) {
	if(array[i]%2!=0) {
		New[x++]=array[i];
	}
}
System.out.println("updated array is");
for(int i=0;i<size;i++) {
	System.out.print(New[i]);
}

	}

}
