package com.hef.abstrat_Interface.problmStmt;

public class AdultUser implements LibraryUser {
	int age;
	String BookType;

	/*
	 * 10. The methods in the AdultUser class should perform the following logic. 1.
	 * registerAccount : if age > 12, a message displaying “You havesuccessfully
	 * registered under an Adult Account” should be displayed in the console. If
	 * age<12, a message displaying, “Sorry, Age must be greater than 12 to register
	 * as an adult” should be displayed in the console.
	 * 
	 * 2. requestBook: if bookType is “Fiction”, a message displaying “Book Issued
	 * successfully, please return the book within 7 days” should be displayed in
	 * the console. else, a message displaying, “Oops, you are allowed to take only
	 * adult Fiction books” should be displayed in the console.
	 * 
	 */ @Override
	public void RegisterAccount(int age) {
		// TODO Auto-generated method stub
		if (age > 12) {
			System.out.println("You havesuccessfully registered under an Adult Account");
		} else if (age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void RequestBook(String BookType) {
		// TODO Auto-generated method stub
if (BookType=="Fiction") {
	System.out.println("Book Issued successfully, \n please return the book within 7 days");
}else 
	System.out.println("Oops You allowed to take only Adult Fiction Books");
	}

}
