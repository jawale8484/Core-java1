package com.hef.inheritance;
	
//11.WAP to check whether you can inherit static variable of Parent class in Child class
class parent1 {
	static int a=10;
	
}
public class Test_Static_11th extends parent1 {

	int v = a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test_Static_11th ob=new Test_Static_11th();
System.out.println(a);	
//ob.a;							//The static field parent.a should be accessed in a static way
	
	}

}
