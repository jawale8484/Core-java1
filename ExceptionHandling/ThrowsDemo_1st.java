package com.hefshine.ExceptionHandling;
/*: Create a class, ThrowsDemo with a main method
	The main method should invoke the division method in Demo class.
	The main method should also catch the ArithmeticException thrown by the division method and 
	print the Exception “Arithmetic Exception is Thrown”
	The try/catch block should also have a finally block which prints a message “The result is” <Result>

*/

import java.util.Scanner;

public class ThrowsDemo_1st {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend");
		int Dividend = sc.nextInt();
		System.out.println("Enter Divisior");
		int Divisior = sc.nextInt();
		Demo_1st ob = new Demo_1st();
	
		ob.div(Dividend, Divisior);
	
	}

}
