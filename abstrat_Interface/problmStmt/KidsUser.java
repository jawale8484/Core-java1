package com.hef.abstrat_Interface.problmStmt;

import java.util.Scanner;

/*
9.	The methods in the KidUser class should perform the following logic. 
1.	registerAccount : if age < 12, a message displaying “You have successfully registered under a Kids Account” 
should be displayed in the console. 
If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the 
console. 

2.	requestBook: if bookType is “Kids”, a message displaying “Book Issued successfully, 
please return the book within 10 days” should be displayed in the console. 
else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console. 

*/
public class KidsUser implements LibraryUser {
	
/*	public KidsUser() {
		// TODO Auto-generated constructor stub
		int age = 0;
	}
*/

	
	
	public void RegisterAccount(int age) {
		// TODO Auto-generated method stub
		
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else if (age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void RequestBook(String BookType) {
		// TODO Auto-generated method stub
		if (BookType == "Kids") {
			System.out.println("Book Issued successfully, \r\n please return the book within 10 days");
		} else
			System.out.println("Oops, you are allowed to take only kids books");
	}

	
}
