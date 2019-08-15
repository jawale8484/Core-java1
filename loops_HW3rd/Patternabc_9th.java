package com.hef.loops_HW3rd;

import java.util.Scanner;

public class Patternabc_9th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number,still you want to print");
int a=sc.nextInt();

for(int i=1;i<=a;i++)
{
	char ch='A';
	for(int j=1;j<=i;j++)
	{
		System.out.print(" "+ch);
		ch++;
	}
	System.out.println();
	}

}
	}
