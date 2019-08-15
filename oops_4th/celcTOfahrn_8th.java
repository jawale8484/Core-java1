package com.hef.oops_4th;

import java.util.Scanner;

public class celcTOfahrn_8th {
Scanner sc=new Scanner(System.in);

void celcTOfahrn(){
	
	System.out.println("Enter temperature in celcius");
	int celc=sc.nextInt();
	double a=9/5.0;
	System.out.println(a);
	double fahrn=(celc*a)+32;
	System.out.println(celc+"celcius converted in tpo fahrnheit="+fahrn);
	
	System.out.println("Enter temperature in fahrenheit");
	float fhrn=sc.nextFloat();
	
	float ConvCELC=(fhrn-32)*5/9;
	
	System.out.println(fhrn+"fahrenheit converted in to celcius="+ConvCELC);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		celcTOfahrn_8th ob=new celcTOfahrn_8th();
				ob.celcTOfahrn();
	}

}
