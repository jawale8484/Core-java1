package controlstmt_HW2nd;

import java.util.Scanner;

public class calculator_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		System.out.println("Enter operation you want to perform");
		char operator = sc.next().charAt(0);
		switch (operator) {
		case '+': {
			result = num1 + num2;
		}
		System.out.println("addition is"+result);
			break;
		case '-': {
			result = num1 - num2;

		}
		System.out.println("substraction is"+result);
			break;
		case '*':{
		result=num1 * num2;
		
		}
		System.out.println("multiplication is"+result);
		break;
		case '/':{
			result=num1/num2;
			
		}
		System.out.println("Division is"+result);
		break;
		default: {
			System.out.println("Enter invalid operation");
		}

	}
	}
	}