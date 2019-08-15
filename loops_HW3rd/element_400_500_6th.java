package com.hef.loops_HW3rd;

import java.util.Scanner;

public class element_400_500_6th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rem=0;
Scanner sc=new Scanner(System.in);
for (int i=400;i<500;i++) {
	rem=i%7;
	if (rem==7) {
		System.out.println(i+",");
	}
}
	}

}
