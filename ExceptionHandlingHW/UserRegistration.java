package com.hefshine.ExceptionHandlingHW;

import java.util.Scanner;

//import com.classpractical.InvalidAgeException;

public class UserRegistration {

	private	String username;
	private int age;
	private String country;
	
	 String getUsername() {
		return username;
	}
	 void setUsername(String username) {
		this.username = username;
	}
	 int getAge() {
		return age;
	}
	 void setAge(int age) {
		this.age = age;
	}
	 String getCountry() {
		return country;
	}
	 void setCountry(String country) {
		this.country = country;
	}
	
	void registerProfile(String name,String country,int age)
	{
		System.out.println("Entered Name is : "+name);
		if (!country.equalsIgnoreCase("India"))
				{
			         try 
			         {
						throw new InvalidCountryException();
						
					 } 
			         catch (InvalidCountryException e) {
						
						//e.printStackTrace();
					}
					
				}
		else {
			
			System.out.println("Entered Country is : "+country);
		}
		if(age<18)
		{
			
				try{
					
					throw new InvalidAgeException("< than 18 ");
				} 
				catch (InvalidAgeException e) {
					//e.printStackTrace();
					
				}
				finally {
					System.out.println("you should enter details above 18 years");
				}
			
		}
		else {
			
			System.out.println("Entered Age is : "+age);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter user name:");
          String name=sc.next();
          
          System.out.println("enter country name:");
          String country=sc.next();
          
          System.out.println("enter age:");
          int age=sc.nextInt();
          
          UserRegistration ur=new UserRegistration();
          ur.registerProfile(name,country,age);
          
          
	}

}
