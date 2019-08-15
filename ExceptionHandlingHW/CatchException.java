package com.hefshine.ExceptionHandlingHW;
//3.	WAP to show any Exception and catch that Exception.
import java.util.Scanner;

public class CatchException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1,num2;
			int result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st integer");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
	try {
		result=num1/num2;
		
		System.out.println(result);
	}catch(ArithmeticException e) {
		System.out.println("divide by zero.it give infinity value");
	}

	
	}

}
