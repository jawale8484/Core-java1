package com.hef.oops_4th;

import java.util.Scanner;

public class Convert_6th {
Scanner sc=new Scanner(System.in);


	void convert() {
		
		System.out.println("Enter lenth in centimeter");
		float length=sc.nextFloat();
		
		float meter=length/100;
		System.out.println("length="+length+" in meter is="+meter);
		
		
		float km=length/100000;
		System.out.println("length="+length+" in kilometer is "+km);
				
				
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert_6th ob=new Convert_6th();
		ob.convert();
	}

}
