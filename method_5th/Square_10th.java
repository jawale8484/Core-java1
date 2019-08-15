package comp.hef.method_5th;

import java.util.Scanner;

/*	10.	Create a Java class “Square.java” with a method “calculateArea”
This method should accept length as an argument, calculate the area and return the area.
The main method should invoke the Square objects “calculateArea” method by passing a 
value for the length, say 20.
The main method should also print the area (result).
*/

public class Square_10th {

	static int area, a;

	int CalculateArea(int length) {

		area = length * length;

		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of square");
		a = sc.nextInt();

		Square_10th ob = new Square_10th();
		ob.CalculateArea(a); 							// passing parameter

		int x = ob.area; 								// catch return value
		System.out.println("Area of Triangle=" + x);

	}

}
