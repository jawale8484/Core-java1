package controlstmt_HW2nd;

import java.util.Scanner;

public class equilateralTriangle_5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int side1,side2,side3;

		Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st side of triangle:-");
		side1=sc.nextInt();
		System.out.println("Enter 2nd side of triangle:-");
		side2=sc.nextInt();
		System.out.println("Enter 3rd side of triangle:-");
		side3=sc.nextInt();
		if(side1==side2 && side2==side3&&side3==side1) {
			System.out.println("Triangle is equilateral");
		}else if(side1==side2 ||side2==side3||side3==side1)
			System.out.println("Triangle is isoscles");
		else
			System.out.println("Triangle is Scalene");


	}

}
