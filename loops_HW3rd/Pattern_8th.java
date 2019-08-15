package com.hef.loops_HW3rd;

import java.util.Scanner;

public class Pattern_8th {
	/*
	8.	WAP to print following Pattern
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			int num;
			if(i%2==0)
			{
				num=0;
			
		for(int j=1;j<=5;j++)
			{
			System.out.print(num);
			num=(num==0)?1:0;
			}
			}
			else
			{
				num=1;
				for(int j=1;j<=5;j++)
				{
					System.out.print(num);
					num=(num==0)?1:0;
				}
			}
			System.out.println(" ");
}}}