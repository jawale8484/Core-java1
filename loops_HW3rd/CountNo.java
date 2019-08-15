package com.hef.loops_HW3rd;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int Number, Count=0;
		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		for (Count = 0; Number > 0; Number = Number/10) {
			Count = Count++; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	}

}
