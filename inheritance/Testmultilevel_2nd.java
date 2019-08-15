package com.hef.inheritance;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

//2.	Create 3 class tests and define methods explaining the concept of multilevel inheritance.
class class1{
	Scanner sc=new Scanner(System.in);
	int num1,num2,result;
	void input() {
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
	}
}
class class2 extends class1{
	
	int result() {
		result=num1-num2;
		return result;
	}
	
}
class class3 extends class2{
	void displaydata() {
		System.out.println("substraction of "+num1+" & "+num2+" is "+result);
		
	}
}

public class Testmultilevel_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
class3 ob=new class3();
ob.input();
ob.result();
ob.displaydata();
	}

}
