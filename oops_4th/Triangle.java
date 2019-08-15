package com.hef.oops_4th;

import java.util.Scanner;

public class Triangle {
Scanner sc=new Scanner(System.in);



void calc() {
	
	System.out.println("Enter one side of triangle");
	int a1=sc.nextInt();
	
	System.out.println("Enter second side of triangle");
	int a2=sc.nextInt();
	
	int a3=180-(a1+a2);
System.out.println("third angle is "+a3);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Triangle ob=new Triangle();
ob.calc();
	}

}
