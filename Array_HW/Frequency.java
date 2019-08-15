package com.hefshine.Array_HW;

//3.WAP to count frequency of each element in an array.
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int size;
		int count;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array");
		size=input.nextInt();
		int arr[]=new int [size];
		int f[]=new int [100];
		System.out.println("enter the elements of array");
		for(i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
			f[i]=-1;
			
		}
		System.out.println("elements of array are");
		for(j=0;j<size;j++)
		{
			System.out.print("\t"+arr[j]+"\n");
		}
		System.out.println("frequency of elements are");
		for(i=0;i<size;i++)
		{
			count=1;
			for(j=i+1;j<size;j++)
			{
				if (arr[i]==arr[j])
				{
					count++;
					f[j]=0;
				}
				
			}
			if(f[i]!=0)
			{
				System.out.println(arr[i]+" "+count);
			}
			
		}
		
	}
}

