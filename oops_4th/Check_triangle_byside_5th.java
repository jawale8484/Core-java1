package com.hef.oops_4th;

import java.util.Scanner;

public class Check_triangle_byside_5th {
Scanner sc=new Scanner(System.in);


void triangle(){
	
	System.out.println("Enter 1st side");
	int side1=sc.nextInt();
	
	System.out.println("ENter 2nd Side");
	int side2=sc.nextInt();
	
	System.out.println("ENter 3rd side");
	int side3=sc.nextInt();
	
	if (side1 == side2 && side2 == side3 && side3 == side1) {
		System.out.println("Triangle is valid for Equilateral");
	}else if (side1==side2 || side2==side3||side3==side1)
		System.out.println("Triangle is valid for isoscale");
	else
		System.out.println("Triangle is not valid for equilateral and isoscales");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check_triangle_byside_5th ob=new Check_triangle_byside_5th();
		ob.triangle();
		

	}

}