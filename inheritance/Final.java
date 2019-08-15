package com.hef.inheritance;
//7.	WAP to Show 3 use of final - final class, final variable and final method

final class final_1{
	final int a=1;
	final void m1() {
		int b=1;
		int c=2;
		System.out.println(a);
		a=b+c;								//final variable cannot change
	
												//final method cannot been override
	}
}
class finl extends final_1{							//final class cannot been extends
	
	
}
public class Final extends final_1{

	public static void main(String[] args) {
		Final ob=new Final();
		ob.m1();
	}

}
