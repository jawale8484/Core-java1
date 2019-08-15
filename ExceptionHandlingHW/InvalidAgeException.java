package com.hefshine.ExceptionHandlingHW;

public class InvalidAgeException extends Exception{
public InvalidAgeException(String s) {
	// TODO Auto-generated constructor stub
super();
System.out.println("User is not able to register.age must be 18+");
}
}
