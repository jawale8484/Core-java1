package com.hef.oops_4th;

import java.util.Scanner;

public class bonusCOUNT_9th {
Scanner sc=new Scanner(System.in);
void IPsal() {
	
	
	
	System.out.println("Enter salary of employee");
	float sal=sc.nextFloat();
	
	
	
	System.out.println("Enter the year of service");
	float year=sc.nextFloat();
	double bonus=0;
	if (year>=5) {
		bonus=sal*0.05;
	System.out.println("You have "+bonus+"RS. bonus");
	
	double totalsalary=sal+bonus;
	System.out.println("And your updated salary is "+sal+" + "+bonus+" bonus="+totalsalary);
		
	}else
		System.out.println("There is no bonus for you");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bonusCOUNT_9th ob=new bonusCOUNT_9th();
				ob.IPsal();
	}

}
