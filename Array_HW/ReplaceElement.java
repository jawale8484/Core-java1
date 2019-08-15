package com.hefshine.Array_HW;

import java.util.Scanner;

public class ReplaceElement {
//8.	WAP to insert an element in a specific position into an array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();
int array[] = Getarray.getIntArrayOfSize(size); // this method will input array
System.out.println("ENter the position to change");
int pos=sc.nextInt();
int index=pos-1;										//for index of an array
System.out.println("Enter the element to change");
int element=sc.nextInt();
for(int i=0;i<size;i++) {
	if(array[i]==index) {
		array[i]=element;
	}
}
System.out.println("updated array is");
for(int i=0;i<size;i++) {

System.out.print(array[i]+" ");

}
	
	}

}
