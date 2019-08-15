package com.hefshine.ExceptionHandlingHW;
//5.	WAP to check what happen when Exception is thrown by main method
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowByMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream("text.txt");
String s;
throw new FileNotFoundException();
}

}
