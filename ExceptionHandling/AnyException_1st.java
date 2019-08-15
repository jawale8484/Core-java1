package com.hefshine.ExceptionHandling;

import java.util.Scanner;

public class AnyException_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		int c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=sc.nextInt();
		b=sc.nextInt();
try {
	c=a/b;
	System.out.println("Division of "+a+" & "+b+" is "+c);
}
catch(ArithmeticException e) {
	System.out.println("Divide by zero is not allowed");
}
	}

}
