package com.hefshine.ExceptionHandlingHW;

//6.	WAP to check whether Unchecked Exception is propagated in calling stack
//yes done with unchecked exception 
public class PropagateUnChecked_6th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
method1();
System.out.println("This is main");
	}
static void method1() {
	method2();
	System.out.println("This is method 1st");
}
static void method2() {
	// TODO Auto-generated method stub
System.out.println("This is method 2nd");
 try {
	method3();
}
catch(ArithmeticException e) {
	System.out.println("Infinite value");
}
}
 static void method3() {
	// TODO Auto-generated method stub

		int result=10/0;
		

}

}
