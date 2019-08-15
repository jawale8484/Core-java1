package com.hef.poly_encaps;
//1.Write a program to check whether constructors can override.
class Person{
	int a=10;
	int b=20;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int a,int b){				
		this.a=a;
		this.b=b;
		
	}
}
public class Construct_1st extends Person{
	public Construct_1st() {
		// TODO Auto-generated constructor stub
	
	}
														//constructor name should be a class name, 
														//hence constructor cannot been override
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
