package com.hef.oops_4th;

import java.util.Scanner;

public class convertDAY_7th {
Scanner sc=new Scanner(System.in);

void convertday() {
	
	System.out.println("Enter minute for conversion");
	int min=sc.nextInt();
	
	long year=min/525600;
	System.out.println(min+"minute converted into years are="+year+"years");
	
	float day=min/1440;
	System.out.println(min+"minute converted into days are="+day+"days");
	
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		convertDAY_7th ob=new convertDAY_7th();
		ob.convertday();

	}

}
