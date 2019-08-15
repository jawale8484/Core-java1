package com.hef.oops_4th;

import java.util.Scanner;

public class Kids_laptop {
	Scanner sc = new Scanner(System.in);

	void Operation() {
		System.out.println("Enter number you want to perform");
		int a=0;
		float result = 0;
		int num1, num2;
		while (a != 4) {
			System.out.println("1)Addition\n2)Substract\n3)Multiply\n4)Quit");
			 a = sc.nextInt();
			
			
			
			switch (a) {
			case 1: {
				System.out.println("Enter the first number");
				num1 = sc.nextInt();
				System.out.println("Enter the second number");
				num2 = sc.nextInt();
				result = num1 + num2;
				
			}
			
			System.out.println("Addition is "+result);
			break;
			case 2: {

				System.out.println("Enter the first number");
				num1 = sc.nextInt();
				System.out.println("Enter the second number");
				num2 = sc.nextInt();
				result = num1 - num2;
			}
			
			System.out.println("Substraction is "+result);
			break;
			
			case 3: {

				System.out.println("Enter the first number");
				num1 = sc.nextInt();
				System.out.println("Enter the second number");
				num2 = sc.nextInt();
				result = num1 * num2;

			}
			
			System.out.println("Multiplication is "+result);
			break;
			default:
				System.out.println("Quit");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kids_laptop ob=new Kids_laptop();
		ob.Operation();
	}

}
