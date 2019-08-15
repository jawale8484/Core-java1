package com.hefshine.Multithreading;

import java.util.Scanner;

public class Days extends Thread{
	
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of day");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		}
	}
	
	
}
