package com.hefshine.ExceptionHandlingHW;

import java.util.Scanner;

//1.	WAP to show any Exception
public class AnyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer");
		num1=sc.nextInt();
		num2=sc.nextInt();
		

	result=num1/num2;
	
	System.out.println(result);
	}

}
