package com.hefshine.ExceptionHandlingHW;
//WAP to check whether checked Exception is propagated in calling stack 
//it cannot done with try catch block
//it done with throws and throw
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedPropagation {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
method1();

	}

	 static void method1() {
		// TODO Auto-generated method stub
	try {
		 method2();
	}
	catch(FileNotFoundException e) {					
		System.out.println("File not found at this location");
	}
	}

	static void method2() {
		// TODO Auto-generated method stub
	FileInputStream file=new FileInputStream("Text.txt");
	
	}

*/
	public static void main(String[] args) throws FileNotFoundException {
		m1();
		
	}

	 static void m1() throws FileNotFoundException {
		// TODO Auto-generated method stub
		m2();
		
	}

	 static void m2() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("text.txt");
	}}
